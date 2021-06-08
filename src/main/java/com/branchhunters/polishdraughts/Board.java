package com.branchhunters.polishdraughts;
import com.branchhunters.polishdraughts.Coordinates;

public class Board {
    private Pawn[][] board;

    Board(int n) {
        board = new Pawn[n][n];
        //Pawn black = new Pawn("black",false,Coordinates(x,y));
        //Pawn white = new Pawn("white",false,Coordinates(x,y));
    }

    private void setBlack(Pawn[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int i = 0; i < row; i++) {
                board[row][i] = new Pawn("black", row,i);
            }
        }
    }

    private void setWhite(Pawn[][] board) {

    }

    public void setBoard(Pawn[][] board) {
        this.board = board;
    }

    public Pawn[][] getBoard() {
        return board;
    }
}
