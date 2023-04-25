package minesweeper;

public class Minesweeper {

    public Board generateBoard(Board board) {
        System.out.println("\nboard state before generated board:");
        System.out.println(board);

        /* Possible code */

        for (int row = 0; row < board.getNumRows(); row++) {
            for (int col = 0; col < board.getNumCols(); col++) {
                if (board.getCell(row, col).equals("*")) continue;
                board.updateCell(row, col, "0");

                /* Possible code */

            }
        }

        /* Possible code */

        System.out.println("\nboard state after generated board:");
        System.out.println(board);

        return board;
    }

    public static void main(String[] args) {

    }
}
