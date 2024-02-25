package com.sam.java.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome to Tic Tac Toe Game");
        boolean continueGame = true;
        while(continueGame) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Start New Game");
            System.out.println("2. Exit Game");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("New Game Started");
                    TicTacToeGame game = new TicTacToeGame();
                    System.out.println("game winner is: " + game.startGame());
                    continue;

                case 2:
                    System.out.println("Exited Game");
                    continueGame = false;
                    break;

                default:
                    continue;

            }
        }
    }
}
