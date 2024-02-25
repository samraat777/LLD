package com.sam.java.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> playerList;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame(){
        //Creating 2 player
        playerList = new LinkedList<>();
        PlayerPieceX crossPiece = new PlayerPieceX();
        Player player1 = new Player(1,crossPiece);

        PlayerPieceO zeroPiece = new PlayerPieceO();
        Player player2 = new Player(2,zeroPiece);

        playerList.add(player1);
        playerList.add(player2);

        //initialize Board
        gameBoard = new Board(3);

    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            //We are taking player from top of player list and since its turn will again come at last
            // when other players have played so we will add the current player at the last
            Player playerTurn = playerList.removeFirst();

            //Printing Available Space
            gameBoard.printBoard();

            //Getting free spaces from the board
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty())
            {
                noWinner = false;
            }
            
            //Read user input for current step
            System.out.println("Player :"+ playerTurn.getId() + "---Enter row and col number separated by , : ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            
            //Place the piece
            boolean pieceAddedSuccessfully = false;
            try {
                pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputCol,playerTurn.playingPiece);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                playerList.addFirst(playerTurn);
                continue;
                //throw new RuntimeException(e);
            }
            if(!pieceAddedSuccessfully)
            {
                //The position is already taken enter new place
                System.out.println("The position is already taken enter new place");
                playerList.addFirst(playerTurn);
                continue;
            }
            playerList.addLast(playerTurn);
            
            boolean winner = checkWinner(inputRow,inputCol,playerTurn.playingPiece.playingSymbol);
            if(winner)
            {
                noWinner = false;
                return "Player " + playerTurn.getId();
            }

        }
        
        return "tie";
    }

    private boolean checkWinner(int row, int column, PlayingSymbol playingSymbol) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].playingSymbol != playingSymbol) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].playingSymbol != playingSymbol) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].playingSymbol != playingSymbol) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].playingSymbol != playingSymbol) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
