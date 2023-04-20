package minesweeper;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public final class Board  {
    private List<List<String>> board;

    public Board(String boardString) {
        this.board = parseToBoard(boardString);
    }

    public List<List<String>> content() {
        return board;
    }

    public String getCell(int row, int col) {
        return board.get(row).get(col);
    }

    public void updateCell(int row, int col, String newVal) {
        board.get(row).set(col, newVal);
    }

    public int getNumRows() {
        return board.size();
    }

    public int getNumCols() {
        return board.get(0).size();
    }

    private List<List<String>> parseToBoard(String boardString) {
        List<String> rows = Stream.of(boardString.trim().split("]"))
                .map(row -> row.trim().replaceAll("\\[", "")).toList();

        Pattern p = Pattern.compile("\s*[-*0-8](\s*[-*0-8])*\s*");
        for (String row : rows) {
            Matcher m = p.matcher(row);
            if (!m.matches()) throw new
                    IllegalArgumentException("Row: [" + row + "] is not a valid row in the minesweeper matrix");
        }
        List<List<String>> board = rows.stream()
                .map(row -> List.of(row.trim().split("(?<=[-*0-8])\s*"))).toList();
        int numCols = board.get(0).size();
        for (List<String> row : board) {
            if (row.size() != numCols) throw new
                    IllegalArgumentException("Row: " + row + " does not have the same amount of columns as the other rows");
        }
        return board;
    }

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            Board thisBoard = (Board) obj;
            return content() == thisBoard.content();
        }

        /* Check if o is an instance of Board or not
          "null instanceof [type]" also returns false */
        if (!(obj instanceof Board otherBoard)) {
            return false;
        }

        // Compare the data members and return accordingly
        return content() == otherBoard.content();
    }

    @Override
    public String toString() {
        String board = "";
        for (List<String> row : content()) {
            board += row.toString() + "\n";
        }
        return board;
    }
}
