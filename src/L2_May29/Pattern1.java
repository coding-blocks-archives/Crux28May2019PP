package L2_May29;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class Pattern1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int row = 1;

		while (row <= n) {

			// work
			int col = 1;
			while (col <= n) {
				System.out.println("*");
				col = col + 1;
			}

			// row prep , varibales modification
			System.out.println();
			row = row + 1;
		}

	}
}
