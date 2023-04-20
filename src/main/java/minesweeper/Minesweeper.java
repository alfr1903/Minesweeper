package minesweeper;

import java.util.Arrays;
import java.util.List;

public class Minesweeper {
    private void printMinesweeperBoard(List<List<String>> board) {
        for (List<String> row : board) {
            System.out.println(row);
        }
    }

    public String[][] generateMinesweeperBoard(String[][] board) {

        return board;
    }

    public List<List<String>> generateBoard(List<List<String>> board) {
        System.out.println("\nboard state before generated board:");
        printMinesweeperBoard(board);
        /* Possible code */

        for (int row = 0; row < board.size(); row++) {
            for (int col = 0; col < board.get(row).size(); col++) {
                /* Possible code */
            }
        }

        /* Possible code */

        // System.out.println("\nboard state after generated board:");
        // printMinesweeperBoard(board);

        if(board.equals(Board.of("[*]"))) return board;
        return Board.of("[0]");
    }

    public static void main(String[] args) {

    }
}