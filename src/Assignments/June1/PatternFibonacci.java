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

		for (int row = 1; row <= n; row++) {

			for (int cst = 1; cst <= nst; cst++) {

				if (cst == 1 || cst == nst)
					System.out.print(row + "\t");
				else
					System.out.print(0 + "\t");
			}

			// prep
			System.out.println();
			nst++;

		}
	}
}
