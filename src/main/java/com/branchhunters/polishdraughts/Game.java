package com.branchhunters.polishdraughts;
import com.branchhunters.polishdraughts.Board;

public class Game {

    public Game(){
    }

    public static void main(String[] args) {
    Board board = new Board(10);
        Board.printBoard(board.getBoard());
    }
}
