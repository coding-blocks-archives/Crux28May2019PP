package L2_May29;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class Pattern18 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = 1;
		int nsp = n/2;

		int row = 1;

		while (row <= n) {

			// work

			int cst = 1;
			while (cst <= nsp) {
				System.out.print(" ");
				cst = cst + 1;
			}

			int csp = 1;
			while (csp <= nst) {
				System.out.print("*");
				csp = csp + 1;
			}

			// prep
			if (row <= n/2) {
				nsp = nsp - 1;
				nst = nst + 2;
			} else {
				nst = nst - 2;
				nsp = nsp + 1;
			}

			row = row + 1;
			System.out.println();

		}

	}
}
