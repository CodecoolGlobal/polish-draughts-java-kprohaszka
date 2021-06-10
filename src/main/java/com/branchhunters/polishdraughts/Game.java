package com.branchhunters.polishdraughts;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
    private Board board;
    private boolean gameIsRunning;

    public Game() throws InterruptedException {
        menu();
    }

    public Board getBoard() {
        return this.board;
    }

    public void menu() throws InterruptedException {
        System.out.println("POLISH DRAUGHTS");
        TimeUnit.SECONDS.sleep(2);
        promptEnterKey();
    }

    public void promptEnterKey() {
        System.out.println("Hit \"ENTER\" to Start");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        clearScreen();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void start() {
        this.board = new Board();
        clearScreen();
        this.gameIsRunning = true;
        while (gameIsRunning) {
            playRound();
        }
    }

    private void playRound() {
        clearScreen();
        System.out.println("White moves first...");
        Board.printBoard(board.getBoard());
        promptEnterKey();

    }


    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.start();
    }
}
