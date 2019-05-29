package L2_May29;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class Pattern15 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int nst = n;
		int nsp =0 ;

		int row = 1;

		while (row <= 2 * n - 1) {

			// work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}

			// prep
			if (row <= n - 1) {
				nsp = nsp + 2;
				nst = nst - 1;
			} else {
				nst = nst + 1;
				nsp = nsp - 2;
			}

			row = row + 1;
			System.out.println();

		}

	}
}
