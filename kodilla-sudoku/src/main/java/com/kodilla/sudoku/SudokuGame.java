package com.kodilla.sudoku;

public class SudokuGame {
    private static final int BOARD_SIZE = 9;

    int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInColumn(int[][] board, int number, int col) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInBox(int[][] board, int number, int row, int col) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = col - col % 3;
        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValidPlacement(int[][] board, int number, int row, int col) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, col) &&
                !isNumberInBox(board, number, row, col);
    }


}
