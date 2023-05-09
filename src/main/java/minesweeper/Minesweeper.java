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
        Minesweeper minesweeper = new Minesweeper();

        // can be used to test final solution
        /*
        minesweeper.generateBoard(
                new Board(
                                """
                                [* - - - * - - -]
                                [* - - - * - - -]
                                [- - - - * * - -]
                                [- - - - - * - -]
                                [- - - - - - - -]
                                [- - - - - - - -]
                                [- - - - - - - -]
                                [- - * * * - - -]
                                """
                )
        );
        */

        // printed answer should look like this:
        /*
        [* 2 0 2 * 2 0 0]
        [* 2 0 3 * 4 1 0]
        [1 1 0 2 * * 2 0]
        [0 0 0 1 3 * 2 0]
        [0 0 0 0 1 1 1 0]
        [0 0 0 0 0 0 0 0]
        [0 1 2 3 2 1 0 0]
        [0 1 * * * 1 0 0]
        */

    }
}
