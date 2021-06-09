package com.branchhunters.polishdraughts;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public Game() throws InterruptedException {
        menu();
    }
    public void menu() throws InterruptedException {
        System.out.println("POLISH DRAUGHTS");
        TimeUnit.SECONDS.sleep(2);
        promptEnterKey();
    }
    public void promptEnterKey(){
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
        Board board = new Board();
        clearScreen();
        System.out.println("White moves first...");
        Board.printBoard(board.getBoard());
    }
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.start();
    }
}
