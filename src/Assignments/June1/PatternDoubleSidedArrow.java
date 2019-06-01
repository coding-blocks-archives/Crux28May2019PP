package Assignments.June1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {

		int n = 9;

		int nspb = n - 1;
		int nspa = -1;
		int nst = 1;

		int start = 1;

		for (int row = 1; row <= n; row++) {
			// work

			int val = start;

			// spaces before
			for (int cspb = 1; cspb <= nspb; cspb++) {
				System.out.print(" ");
			}

			// stars
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print(val);
				val--;
			}

			// spaces after
			for (int cspa = 1; cspa <= nspa; cspa++) {
				System.out.print(" ");
			}

			// stars

			int cst = 1;
			val = 1;

			if (row == 1 || row == n) {
				cst = 2;
			}
			for (; cst <= nst; cst++) {
				System.out.print(val);
				val++;
			}

			// prep

			System.out.println();

			if (row <= n / 2) {
				nspb -= 2;
				nspa += 2;
				nst++;
				start++;
			} else {
				nspb += 2;
				nspa -= 2;
				nst--;
				start--;
			}

		}

	}
}
