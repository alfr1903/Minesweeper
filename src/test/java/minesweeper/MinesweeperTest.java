package minesweeper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinesweeperTest {
    private final Minesweeper minesweeper = new Minesweeper();

    String[][] oneByOneMatrixBomb = new String[][] {{"*"}};
    String[][] oneByOneMatrixNoBomb = new String[][] {{"-"}};
    String[][] oneByOneMatrixZero = new String[][] {{"0"}};

    String[][] threeByThreeMatrix = new String[][] {
            {"-", "-", "*"},
            {"*", "-", "-"},
            {"-", "-", "-"},
    };

    @Test
    void whenOneByOneMatrixWithBomb_expectGeneratorToReturnMatrixWithBomb(){
        String[][] generatedBoard = minesweeper.generateMinesweeperBoard(oneByOneMatrixBomb);
        assertEquals(generatedBoard, oneByOneMatrixBomb);
    }
}