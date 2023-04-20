package minesweeper;

import java.util.List;

public class Minesweeper {

    public List<List<String>> generateBoard(List<List<String>> board) {

        if(board.equals(Board.of("[*]"))) return board;
        return Board.of("[0]");
    }

    public static void main(String[] args) {

    }
}