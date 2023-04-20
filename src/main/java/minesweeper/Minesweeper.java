package minesweeper;

public class Minesweeper {

    public Board generateBoard(Board board) {
        System.out.println("\nboard state before generated board:");
        System.out.println(board);

        /* Possible code */

        for (int row = 0; row < board.getNumRows(); row++) {
            for (int col = 0; col < board.getNumCols(); col++) {
                /* Possible code */
            }
        }

        /* Possible code */

        System.out.println("\nboard state after generated board:");
        System.out.println(board);

        // should be refactored
        if(board.content().equals(new Board("[*]").content())) return board;
        return new Board("[0]");
    }

    public static void main(String[] args) {

    }
}
