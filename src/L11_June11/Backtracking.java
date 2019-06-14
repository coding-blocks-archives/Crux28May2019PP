package L11_June11;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 11-Jun-2019
 *
 */

public class Backtracking {

	static int count = 1;

	public static void main(String[] args) {

		// QueenPermutation(new boolean[4], 4, 0, "");
		// QueenCombination(new boolean[4], 3, 0, "", -1);

		// int[] denom = { 2, 3, 5, 6 };
		// CoinChange(denom, 10, "", 0);

		// QueenCombinationBoxRespect(new boolean[4], 0, 2, 0, "");

		// QueenCombination2D(new boolean[4][4], 0, 0, 4, 0, "");

		// int[][] maze = { { 0, 1, 0, 0, }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1,
		// 0 } };
		// blockedMaze(maze, 0, 0, "", new boolean[maze.length][maze[0].length]);

		KQueen(new boolean[4][4], 0, "", 0, 4);
	}

	public static void QueenPermutation(boolean[] board, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(count++ + " " + ans);
			return;
		}

		for (int i = 0; i < board.length; i++) {

			if (board[i] == false) {
				board[i] = true; // prep
				QueenPermutation(board, tq, qpsf + 1, ans + "q" + qpsf + "b" + i + " ");
				board[i] = false; // undo : backtracking
			}

		}

	}

	public static void QueenCombination(boolean[] board, int tq, int qpsf, String ans, int lastBoxUsed) {

		if (qpsf == tq) {
			System.out.println(count++ + " " + ans);
			return;
		}

		for (int i = lastBoxUsed + 1; i < board.length; i++) {

			board[i] = true; // prep
			QueenCombination(board, tq, qpsf + 1, ans + "q" + qpsf + "b" + i + " ", i);
			board[i] = false; // undo : backtracking

		}

	}

	public static void CoinChange(int[] denom, int amount, String ans, int lastCoinUsedIndex) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = lastCoinUsedIndex; i < denom.length; i++) {

			if (amount >= denom[i])
				CoinChange(denom, amount - denom[i], ans + denom[i], i);

		}

	}

	public static void QueenCombinationBoxRespect(boolean[] board, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}

		// place
		board[col] = true;
		QueenCombinationBoxRespect(board, col + 1, tq, qpsf + 1, ans + "b" + col + " ");
		board[col] = false;

		// not place
		QueenCombinationBoxRespect(board, col + 1, tq, qpsf, ans);

	}

	public static void QueenCombination2D(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(count++ + " " + ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		if (col == board[0].length) {
			QueenCombination2D(board, row + 1, 0, tq, qpsf, ans);
			return;
		}

		// place
		if (isItSafeToPlaceQueen(board, row, col)) {
			board[row][col] = true;
			QueenCombination2D(board, row, col + 1, tq, qpsf + 1, ans + "[" + row + "-" + col + "]");
			board[row][col] = false;
		}

		// not place
		QueenCombination2D(board, row, col + 1, tq, qpsf, ans);

	}

	public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col) {

		// vertically up
		int r = row - 1;
		int c = col;

		while (r >= 0) {

			if (board[r][c]) {
				return false;
			}
			r--;
		}

		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c--;
		}

		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c++;
		}

		// horizontally left
		r = row;
		c = col - 1;

		while (c >= 0) {

			if (board[r][c]) {
				return false;
			}

			c--;
		}

		return true;

	}

	public static void blockedMaze(int[][] maze, int row, int col, String ans, boolean[][] visited) {

		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}

		if (row >= maze.length || col >= maze[0].length || row < 0 || col < 0 || visited[row][col]
				|| maze[row][col] == 1) {
			return;
		}

		visited[row][col] = true;

		// B
		blockedMaze(maze, row + 1, col, ans + "B", visited);
		// T
		blockedMaze(maze, row - 1, col, ans + "T", visited);
		// L
		blockedMaze(maze, row, col - 1, ans + "L", visited);
		// R
		blockedMaze(maze, row, col + 1, ans + "R", visited);

		visited[row][col] = false; // backtracking

	}

	public static void NQueen(boolean[][] board, int row, String ans) {

		if (row == board.length) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < board.length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				NQueen(board, row + 1, ans + "[" + row + "-" + col + "]");
				board[row][col] = false;
			}
		}

	}

	public static void KQueen(boolean[][] board, int row, String ans, int qpsf, int tq) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (row == board.length) {
			return;
		}

		for (int col = 0; col < board.length; col++) {

			if (isItSafeToPlaceQueen(board, row, col)) {
				board[row][col] = true;
				KQueen(board, row + 1, ans + "[" + row + "-" + col + "]", qpsf + 1, tq);
				board[row][col] = false;
			}
		}

		KQueen(board, row + 1, ans, qpsf, tq);
	}

}
