package minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinesweeperTest {
    private final Minesweeper minesweeper = new Minesweeper();

    // when input board [-], expect output board to be [0]
    @Test
    void when_input__1x1_board_with_no_bomb__expect_board_with_0_as_output(){
        Board board = minesweeper.generateBoard(new Board("[-]"));
        Board expectedBoard = new Board("[0]");

        assertEquals(expectedBoard.content(), board.content());
    }

    // when input board [*], expect output board to be [*]
    @Test
    void when_input__1x1_board_with_bomb__expect_board_with_bomb_as_output(){
        Board board = minesweeper.generateBoard(new Board("[*]"));
        Board expectedBoard = new Board("[*]");

        assertEquals(expectedBoard.content(), board.content());
    }

    // when input board [* -], expect output board to be [* 1]
    @Test
    void when_input__1x2_board_with_first_as_bomb__expect_board_with_bomb_and_1_as_output(){
        Board board = minesweeper.generateBoard(new Board("[* -]"));
        Board expectedBoard = new Board("[* 1]");

        assertEquals(expectedBoard.content(), board.content());
    }

}

/*
        empty 1x1 matrix:
            "[-]"

        empty 2x2 matrix:
            """
            [- -]
            [- -]
            """

        empty 3x3 matrix:
            """
            [- - -]
            [- - -]
            [- - -]
            """
     */
