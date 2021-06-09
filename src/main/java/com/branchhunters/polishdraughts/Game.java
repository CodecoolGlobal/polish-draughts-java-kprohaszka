package com.branchhunters.polishdraughts;

public class Game {

    public Game() {
        menu();
    }

    public void menu() {
        System.out.println("POLISH DRAUGHTS");
    }

    public void start() {
        Board board = new Board();
        System.out.println("White moves first...");
        Board.printBoard(board.getBoard());
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
