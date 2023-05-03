package minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinesweeperTest {
    private final Minesweeper minesweeper = new Minesweeper();

    @Test
    void when_adding_1_with_1__expect_2_to_be_the_sum() {
        int sum = 1 + 1;
        int expectedSum = 2;
        assertEquals(expectedSum, sum);
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
