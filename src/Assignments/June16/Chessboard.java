package Assignments.June16;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class Chessboard {

	public static void main(String[] args) {

		System.out.println(chessboard1(0, 0, 2, 2, ""));
	}

	public static int chessboard1(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans + "{" + er + "-" + ec + "}");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int c = 0;

		// knight
		c += chessboard1(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");
		c += chessboard1(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");

		// rook
		if (cr == 0 || cc == 0 || cr == er || cc == ec) {

			// horizontal
			for (int move = 1; move <= ec; move++) {
				c += chessboard1(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}

			// vertical
			for (int move = 1; move <= er; move++) {
				c += chessboard1(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}
		}

		// bishop
		if (cr == cc || cr + cc == er) {
			for (int move = 1; move <= er && move <= ec; move++) {
				c += chessboard1(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}
		}

		return c;
	}

}
