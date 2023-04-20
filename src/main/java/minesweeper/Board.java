package minesweeper;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Board {
    public static void printBoard(List<List<String>> board) {
        for (List<String> row : board) {
            System.out.println(row);
        }
    }


    public static List<List<String>> of(String boardString) {
        List<String> rows = Stream.of(boardString.trim().split("]"))
                .map(row -> row.trim().replaceAll("\\[", "")).toList();

        Pattern p = Pattern.compile("\s*[-*0-8](\s*[-*0-8])*\s*");
        for (String row : rows) {
            Matcher m = p.matcher(row);
            if (!m.matches()) throw new
                    IllegalArgumentException("Row: [" + row + "] is not a valid row in a minesweeper matrix");
        }
        return rows.stream()
                .map(row -> List.of(row.trim().split("(?<=[-*0-8])\s*")))
                .collect(Collectors.toList());
    }
}
