package Assignments.June16;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class Chessboard2 {

	public static void main(String[] args) {

		int n = 3;

		int[] arr = makeMinesPorts(n * n);

		System.out.println(chessboard2(0, 0, n - 1, n - 1, "", arr));
	}

	public static int chessboard2(int cr, int cc, int er, int ec, String ans, int[] mp) {

		if (cr == er && cc == ec) {
			System.out.println(ans + "{" + er + "-" + ec + "}");
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int c = 0;

		int cell = cr * (ec + 1) + cc + 1;

		if (mp[cell] == 1) {
			return 0;
		} else if (mp[cell] == 2) {
			c += chessboard2(er, ec, er, ec, ans + "{" + cr + "-" + cc + "}P", mp);
		}

		// knight
		c += chessboard2(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K", mp);
		c += chessboard2(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K", mp);

		// rook
		if (cr == 0 || cc == 0 || cr == er || cc == ec) {

			// horizontal
			for (int move = 1; move <= ec; move++) {
				c += chessboard2(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R", mp);
			}

			// vertical
			for (int move = 1; move <= er; move++) {
				c += chessboard2(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R", mp);
			}
		}

		// bishop
		if (cr == cc || cr + cc == er) {
			for (int move = 1; move <= er && move <= ec; move++) {
				c += chessboard2(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B", mp);
			}
		}

		return c;
	}

	public static int[] makeMinesPorts(int n) {

		// c odd -> mines
		// c even -> port
		int c = 1;

		int[] arr = new int[n + 1];

		for (int i = 2; i < arr.length; i++) {

			if (isPrime(i)) {

				if (c % 2 == 1) {
					arr[i] = 1;
				} else {
					arr[i] = 2;
				}

				c++;
			}

		}

		return arr;

	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div * div <= n) {

			if (n % div == 0) {
				return false;
			}

			div++;
		}

		return true;
	}

}
