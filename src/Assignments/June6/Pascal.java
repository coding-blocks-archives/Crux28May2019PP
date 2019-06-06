package Assignments.June6;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class Pascal {

	public static void main(String[] args) {

		int n = 7;

		for (int row = 0; row < n; row++) {

			int val = 1;

			for (int col = 0; col <= row; col++) {

				System.out.print(val + "\t");

				val = (val * (row - col)) / (col + 1);

			}

			System.out.println();
		}

	}
}
