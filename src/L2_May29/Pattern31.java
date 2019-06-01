package L2_May29;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class Pattern31 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = 5;

		int row = 1;

		while (row <= n) {

			int val = n;

			int col = 1;
			while (col <= n) {

				if (row + col == n + 1) {
					System.out.print("*");
				} else {
					System.out.print(val);
				}

				val = val - 1;
				col = col + 1;
			}

			System.out.println();
			row = row + 1;

		}

	}
}
