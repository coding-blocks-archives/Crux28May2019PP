package Assignments.June1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class PatternZeros {

	public static void main(String[] args) {

		int n = 5;
		int nst = 1;

		int a = 0;
		int b = 1;

		for (int row = 1; row <= n; row++) {

			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(a + "\t");

				int sum = a + b;
				a = b;
				b = sum;
			}

			// prep
			System.out.println();
			nst++;

		}
	}
}
