package L11_June11;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 11-Jun-2019
 *
 */

public class Backtracking {

	public static void main(String[] args) {

	}

	public static void QueenPermutation(boolean[] board, int tq, int qpsf, String ans) {

		for (int i = 0; i < board.length; i++) {

			board[i] = true; // prep
			QueenPermutation(board, tq, qpsf + 1, ans + "q" + qpsf + "b" + i);
			board[i] = false; // undo : backtracking

		}

	}
}
