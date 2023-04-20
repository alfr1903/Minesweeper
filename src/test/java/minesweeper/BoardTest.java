package minesweeper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BoardTest {

    @Test
    void when_input_matrix_empty_string_expect_to_throw_error() {
        assertThrows(IllegalArgumentException.class, () -> {
           Board.of("");
        });
    }

    @Test
    void when_input_empty_matrix_expect_to_throw_error() {
        assertThrows(IllegalArgumentException.class, () -> {
            Board.of("[]");
        });
    }

    @Test
    void when_input_no_bomb_matrix_expect_to_return_no_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("-"));
        Assertions.assertEquals(list2dActual, Board.of("[-]"));
    }

    @Test
    void when_input_bomb_matrix_expect_to_return_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("*"));
        Assertions.assertEquals(list2dActual, Board.of("[*]"));
    }

    @Test
    void when_input_illegal_char_matrix_expect_to_throw_error() {
        assertThrows(IllegalArgumentException.class, () -> {
            Board.of("[a]");
        });
    }

    @Test
    void when_input_1x2_bomb_matrix_expect_to_return_1x2_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("*","*"));
        Assertions.assertEquals(list2dActual, Board.of("[* *]"));
    }

    @Test
    void when_input_1x2_bomb_matrix_with_extra_spaces_expect_to_return_1x2_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("*","*"));
        Assertions.assertEquals(list2dActual, Board.of("[ *   *  ]"));
    }

    @Test
    void when_input_1x2_no_bomb_matrix_expect_to_return_1x2_no_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("-","-"));
        Assertions.assertEquals(list2dActual, Board.of("[- -]"));
    }

    @Test
    void when_input_1x2_last_bomb_matrix_expect_to_return_1x2_last_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("-","*"));
        Assertions.assertEquals(list2dActual, Board.of("[- *]"));
    }

    @Test
    void when_input_1x2_first_bomb_matrix_expect_to_return_1x2_first_bomb_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("*","-"));
        Assertions.assertEquals(list2dActual, Board.of("[* -]"));
    }

    @Test
    void when_input_1x3_matrix_expect_to_return_1x3_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("*","-","*"));
        Assertions.assertEquals(list2dActual, Board.of("[* - *]"));
    }

    @Test
    void when_input_2x2_matrix_expect_to_return_2x2_2d_list() {
        List<List<String>> list2dActual = List.of(List.of("-","-"), List.of("-", "-"));
        Assertions.assertEquals(
                list2dActual,
                Board.of(
                        """
                                [- -]
                                [- -]
                                """
                )
        );
    }

    @Test
    void when_input_3x3_matrix_expect_to_return_3x3_2d_list() {
        List<List<String>> list2dActual = List.of(
                List.of("-", "-", "-"),
                List.of("-", "-", "-"),
                List.of("-", "-", "-")
        );
        Assertions.assertEquals(
                list2dActual,
                Board.of(
                        """
                                [- - -]
                                [- - -]
                                [- - -]
                                """
                )
        );
    }

    @Test
    void when_input_3x4_matrix_with_all_valid_characters_expect_to_return_3x4_2d_list() {
        List<List<String>> list2dActual = List.of(
                List.of("0", "1", "2", "3"),
                List.of("4", "5", "6", "7"),
                List.of("8", "-", "*", "*")
        );
        Assertions.assertEquals(
                list2dActual,
                Board.of(
                        """
                                [0 1 2 3]
                                [4 5 6 7]
                                [8 - * *]
                                """
                )
        );
    }

    @Test
    void when_input_3x4_matrix_with_last_invalid_character_expect_to_throw_error() {
        assertThrows(IllegalArgumentException.class, () -> Board.of(
                """
                        [0 1 2 3]
                        [4 5 6 7]
                        [8 - * a]
                        """
        ));
    }
}