package com.branchhunters.polishdraughts;

public class Game {

    public Game() {
    }

    public static void main(String[] args) {
        Board board = new Board();
        Board.printBoard(board.getBoard());
    }
}
