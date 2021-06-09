package com.branchhunters.polishdraughts;

import java.util.Arrays;
import java.util.Scanner;


public class Board {
    private Pawn[][] board;
    private Scanner scanner;
    private int n;

    Board() {
        // specify board size
        scanner = new Scanner(System.in);
        System.out.println("Type in an integer between 10 & 20 to specify board size: ");
        String input = scanner.nextLine();
        n = Integer.parseInt(input); //parse input

        // validate input between values
        while (n < 10 || n > 20) {
            System.out.println("Wrong value specified, try between 10 & 20: ");
            input = scanner.nextLine();
            n = Integer.parseInt(input);
        }

        // set pawns on board
        board = setPawns(new Pawn[n][n], n);
    }

    private Pawn[][] setPawns(Pawn[][] board, int n) {
        return setWhitePawns(setBlackPawns(board, n), n);

    }

    private Pawn[][] setWhitePawns(Pawn[][] board, int n) {
        int whitePieces = n * 2;
        for (int row = board.length - 1; row >= 0; row--) {
            if ((row - 1) % 2 == 0) {
                for (int i = 0; i < board[row].length; i += 2) {
                    if (whitePieces > 0) {
                        board[row][i] = new Pawn("white", row, i);
                        whitePieces--;
                    }
                }
            } else {
                for (int i = 1; i < board[row].length; i += 2) {
                    if (whitePieces > 0) {
                        board[row][i] = new Pawn("white", row, i);
                        whitePieces--;
                    }
                }
            }
        }
        return board;
    }

    private Pawn[][] setBlackPawns(Pawn[][] board, int n) {
        int blackPieces = n * 2;
        for (int row = 0; row < board.length; row++) {
            if ((row + 1) % 2 == 0) {
                for (int i = 0; i < board[row].length; i += 2) {
                    if (blackPieces > 0) {
                        board[row][i] = new Pawn("black", row, i);
                        blackPieces--;
                    }
                }
            } else {
                for (int i = 1; i < board[row].length; i += 2) {
                    if (blackPieces > 0) {
                        board[row][i] = new Pawn("black", row, i);
                        blackPieces--;
                    }
                }
            }
        }
        return board;
    }

    private void setWhite(Pawn[][] board, int n) {
        int pieces = n * 2;
    }

    public void setBoard(Pawn[][] board) {
        this.board = board;
    }

    public Pawn[][] getBoard() {
        return board;
    }

    public static void printBoard(Pawn[][] board) {
        for (Pawn[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
