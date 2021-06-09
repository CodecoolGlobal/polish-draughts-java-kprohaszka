package com.branchhunters.polishdraughts;

import java.util.concurrent.TimeUnit;

public class Game {

    public Game() throws InterruptedException {
        menu();
    }

    public void menu() throws InterruptedException {
        System.out.println("POLISH DRAUGHTS");
        TimeUnit.SECONDS.sleep(2);
    }

    public void start() {
        Board board = new Board();
        System.out.println("White moves first...");
        Board.printBoard(board.getBoard());
    }

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.start();
    }
}
