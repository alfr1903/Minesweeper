package minesweeper;

import java.util.Arrays;

public class Minesweeper {

    private void printMinesweeperBoard(String[][] board) {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    public String[][] generateMinesweeperBoard(String[][] board) {
        System.out.println("\nboard state before generated board:");
        printMinesweeperBoard(board);
        /* Possible code */

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                /* Possible code */
            }
        }

        /* Possible code */

        System.out.println("\nboard state after generated board:");
        printMinesweeperBoard(board);
        return board;
    }


    public static void main(String[] args) {

    }
}