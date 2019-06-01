package Assignments.June1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class Pattern33 {

	public static void main(String[] args) {

		int n = 10;

		int nsp = n - 1;
		int nst = 1;

		int row = 1;

		while (row <= n) {

			int val = n - row + 1;

			// spaces
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" ");
			}

			for (int cst = 1; cst <= nst; cst++) {

				if (cst < (nst / 2 + 1)) {
					System.out.print(val);
					val++;
				} else if (cst == nst / 2 + 1) {
					System.out.print(0);
					// val--;
				} else {
					val--;
					System.out.print(val);
					// val--;
				}
			}

			// prep
			System.out.println();
			nsp--;
			nst += 2;
			row++;
		}

	}
}
