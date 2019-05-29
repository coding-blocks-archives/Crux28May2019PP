package L2_May29;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class Pattern32 {

	public static void main(String[] args) {

		int n = 5;

		int nst = 1;
		int row = 1;

		while (row <= 2 * n - 1) {

			int val;

			if (row <= n - 1)
				val = row;
			else
				val = 2 * n - row;

			int cst = 1;
			while (cst <= nst) {

				if (cst % 2 == 0)
					System.out.print("*");
				else
					System.out.print(val);

				cst = cst + 1;
			}

			// prep
			if (row <= n - 1) {
				nst = nst + 2;
			} else {
				nst = nst - 2;
			}

			System.out.println();
			row = row + 1;
		}
	}
}
