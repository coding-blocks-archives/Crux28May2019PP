package L2_May29;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class Pattern9 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;
		int nsp = n - 1;
		int nst = 1;

		while (row <= n) {

			// work
			int spaces = 1;
			while (spaces <= nsp) {
				System.out.print(" ");
				spaces = spaces + 1;
			}

			int stars = 1;
			while (stars <= nst) {
				System.out.print("*");
				stars = stars + 1;
			}

			// prep
			row = row + 1;
			nst = nst + 2;
			nsp = nsp - 1;
			System.out.println();

		}

	}
}
