package Assignments.June1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class PatternHourGlass {

	public static void main(String[] args) {

		int n = 5;

		int nsp = 0;
		int nst = 2 * n + 1;

		int start = n;

		for (int row = 1; row <= 2 * n + 1; row++) {

			int val = start;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);

				if (cst <= nst / 2) {
					val--;
				} else {
					val++;
				}
			}

			// prep
			if (row <= n) {
				nsp++;
				nst -= 2;
				start--;
			} else {
				nsp--;
				nst += 2;
				start++;
			}

			System.out.println();

		}

	}
}
