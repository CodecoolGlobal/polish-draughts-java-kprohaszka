package com.branchhunters.polishdraughts;

import com.branchhunters.polishdraughts.Coordinates;

import java.util.Arrays;

public class Board {
    private Pawn[][] board;

    Board(int n) {
        board = setPawns(new Pawn[n][n], n);
    }

    private Pawn[][] setPawns(Pawn[][] board, int n) {
        int blackPieces = n * 2;
        int whitePieces = n * 2;

        for (int row = 0; row < board.length; row++) {
            if (blackPieces >= 0) {
                if (row + 1 % 2 == 0) {
                    for (int i = 0; i < row; i += 2) {
                        board[row][i] = new Pawn("black", row, i);
                        blackPieces = -1;
                    }
                } else {
                    for (int i = 1; i < row; i += 2) {
                        board[row][i] = new Pawn("black", row, i);
                        blackPieces = -1;
                    }
                }
            }
        }
        for (int row = board.length - 1; row >= 0; row--) {
            if (whitePieces >= 0) {
                if (row - 1 % 2 == 0) {
                    for (int i = row; i > 0; i--) {
                        board[row][i] = new Pawn("white", row, i);
                        whitePieces = -1;
                    }
                } else {
                    for (int i = row; i > 0; i--) {
                        board[row][i] = new Pawn("white", row, i);
                        whitePieces = -1;
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

    public static void printBoard(Pawn[][] board){
        for (Pawn[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
