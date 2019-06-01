package Assignments.June1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class Pattern19 {

	public static void main(String[] args) {

		int n = 7;

		int nst = n / 2 + 1;
		int nsp = -1;
		int row = 1;

		while (row <= n) {

			// star
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*\t");
			}

			// space
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}

			int cst = 1;

			if (row == 1 || row == n) {
				cst = 2;
			}

			while (cst <= nst) {
				System.out.print("*\t");
				cst++;
			}

			// prep
			if (row <= n / 2) {
				nst = nst - 1;
				nsp = nsp + 2;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}

			System.out.println();
			row++;

		}

	}
}
