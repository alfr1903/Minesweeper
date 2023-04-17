package minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinesweeperTest {
    private Minesweeper minesweeper = new Minesweeper();

    String[][] oneByOneBomb = new String[][] {{"*"}};
    String[][] oneByOneNoBomb = new String[][] {{"-"}};
    String[][] oneByOneZero = new String[][] {{"0"}};

    String[][] threeByThreeMatrix = new String[][] {
            {"-", "-", "*"},
            {"*", "-", "-"},
            {"-", "-", "-"},
    };

    @Test
    void whenOneByOneMatrixWithBomb_expectGeneratorToReturnMatrixWithBomb(){
        String[][] generatedBoard = minesweeper.generateMinesweeperBoard(oneByOneBomb);
        assertEquals(generatedBoard, oneByOneBomb);
    }
}