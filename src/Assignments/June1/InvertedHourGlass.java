package Assignments.June1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class InvertedHourGlass {

	public static void main(String[] args) {

		int n = 5;

		int nst = 1;
		int nsp = 2 * n - 1;
		for (int row = 1; row <= 2 * n + 1; row++) {

			int val = n;

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
				val--;
			}

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			val++;
			int cst = 1;
			if (row == n + 1) {
				val++;
				cst = 2;
			}

			for (; cst <= nst; cst++) {
				System.out.print(val);
				val++;
			}

			// prep
			System.out.println();
			if (row <= n) {
				nst++;
				nsp -= 2;
			} else {
				nst--;
				nsp += 2;
			}

		}

	}
}
