package L2_May29;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class PatternNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = 5;

		int row = 1;
		int nsp = n - 1;
		int nst = 1;

		int val = 1;

		while (row <= n) {

			val = 1 ;
			
			// work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp = csp + 1;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				val = val + 1;
				cst = cst + 1;
			}

			// prep
			row = row + 1;
			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();

		}

	}
}
