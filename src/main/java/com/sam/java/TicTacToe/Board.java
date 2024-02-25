package com.sam.java.TicTacToe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece [][]board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    boolean addPiece(int row,int col,PlayingPiece playingPiece) throws Exception {
        if(row>=board.length || col >=board.length)
            throw new Exception("Please Enter correct Value");
        if(board[row][col] != null)
            return false;
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();

        for(int i =0;i<size;i++)
        {
            for(int j =0;j<size;j++)
            {
                if(board[i][j] == null)
                {
                    Pair<Integer,Integer> rowColumn = new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].playingSymbol.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }
}
