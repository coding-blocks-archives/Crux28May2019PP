package Assignments.July13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jul-2019
 *
 */

public class MinimumMoneyNeeded {

	public static void main(String[] args) {

		int[] price = { 0, 3, 4, 2, -1, 6 };

		System.out.println(minimumMoneyBU(price));
	}

	public static int minimumMoneyBU(int[] price) {

		int[] strg = new int[price.length];

		for (int i = 0; i < strg.length; i++) {

			int min;

			if (price[i] == -1) {
				min = Integer.MAX_VALUE;
			} else {
				min = price[i];
			}

			int left = 1;
			int right = i - 1;

			while (left <= right) {

				int lp = strg[left];
				int rp = strg[right];

				if (lp != Integer.MAX_VALUE && rp != Integer.MAX_VALUE) {
					int total = lp + rp;

					min = Math.min(min, total);
				}

				left++;
				right--;

			}

			strg[i] = min;
		}

		if (strg[strg.length - 1] == Integer.MAX_VALUE) {
			return -1;
		}

		return strg[strg.length - 1];

	}
}
