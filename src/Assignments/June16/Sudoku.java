package Assignments.June16;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class Sudoku {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				board[i][j] = scn.nextInt();
			}

		}

		sudoku(board, 0, 0);
	}

	public static boolean sudoku(int[][] board, int row, int col) {

		if (row == board.length) {
			display(board);
			return true;
		}

		if (col == board.length) {
			return sudoku(board, row + 1, 0);

		}

		if (board[row][col] != 0) {
			return sudoku(board, row, col + 1);

		}

		for (int i = 1; i <= 9; i++) {

			if (isItSafe(board, row, col, i)) {
				board[row][col] = i;
				boolean res = sudoku(board, row, col + 1);

				if (res)
					return true;

				board[row][col] = 0;
			}

		}
		
		return false ;

	}

	public static void display(int[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				System.out.print(board[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("-----------------------");
	}

	public static boolean isItSafe(int[][] board, int row, int col, int val) {

		return isItSafeRow(board, row, val) && isItSafeCol(board, col, val) && isItSafeCell(board, row, col, val);
	}

	public static boolean isItSafeRow(int[][] board, int row, int val) {

		for (int c = 0; c < board[0].length; c++) {
			if (board[row][c] == val) {
				return false;
			}
		}

		return true;
	}

	public static boolean isItSafeCol(int[][] board, int col, int val) {

		for (int r = 0; r < board[0].length; r++) {
			if (board[r][col] == val) {
				return false;
			}
		}

		return true;
	}

	public static boolean isItSafeCell(int[][] board, int row, int col, int val) {

		int rs = row - row % 3;
		int cs = col - col % 3;

		for (int r = rs; r < rs + 3; r++) {
			for (int c = cs; c < cs + 3; c++) {

				if (board[r][c] == val) {
					return false;
				}
			}
		}

		return true;

	}

}
