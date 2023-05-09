# Netlight x UiO TDD Workshop
Welcome to this workshop. In this workshop we will use Test-Driven Development (TDD) to implement a Minesweeper 
Board Generator. This README aims to explain how the Minesweeper board works (Briefly) and will provide some examples
on how input and output boards in the program can look .

## Squares and numbers in Minesweeper
Minesweeper is a grid-based game where each numbered cell indicates how many bombs can be found in its surrounding 8 
squares. We here illustrate by examples from a 3x3 board, how numbers indicate how many nearby bombs exist. 
If anything still is unclear, please ask the helpers for the workshop :)

### Some Examples
Three different boards containing only a single bomb:

```
[1 1 0]     [1 1 1]     [0 1 *] 
[* 1 0]     [1 * 1]     [0 1 1]
[1 1 0]     [1 1 1]     [0 0 0]
```

More simple examples with varying amounts of bombs:
```
[* 2 0]     [* * 1]     [* * *] 
[* 3 0]     [* 4 0]     [* 8 *]
[* 2 0]     [* 2 0]     [* * *]
```

## Program input and output boards
The goal of this workshop is to implement a program that can take a board input (containing only bomb placements), 
and spit out a output board with correctly generated numbers according to the bombs in the input board. This subchapter
gives some examples on different board inputs and their corresponding outputs

Note: All boards illustrated in this README can be copied and used as valid input/output in a Board instance
(see the BoardTest class on how to instantiate a new board)
```
in:
[* - -] 
[* - -]
[* - -]

out:
[* 2 0] 
[* 3 0]
[* 2 0]
```

```
in:
[* - -] 
[* - -]
[* * *]

out:
[* 2 0] 
[* 5 2]
[* * *]
```
```
in:
[* - - - * - - -] 
[* - - - * - - -]
[- - - - * * - -]
[- - - - - * - -]
[- - - - - - - -]
[- - - - - - - -]
[- - - - - - - -]
[- - * * * - - -]

out:
[* 2 0 2 * 2 0 0] 
[* 2 0 3 * 4 1 0]
[1 1 0 2 * * 2 0]
[0 0 0 1 3 * 2 0]
[0 0 0 0 1 1 1 0]
[0 0 0 0 0 0 0 0]
[0 1 2 3 2 1 0 0]
[0 1 * * * 1 0 0]
```
