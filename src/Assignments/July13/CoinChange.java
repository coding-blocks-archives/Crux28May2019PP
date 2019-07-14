package Assignments.July13;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jul-2019
 *
 */

public class CoinChange {

	public static void main(String[] args) {

		int[] denom = { 2, 5, 3, 6 };

		System.out.println(coinChangeBU(denom, 10));
	}

	public static int coinChangeBU(int[] denom, int ta) {

		int[] strg = new int[ta + 1];

		strg[0] = 1;

		for (int coin : denom) {
			for (int i = coin; i < strg.length; i++) {
				strg[i] += strg[i - coin];
			}

		}

		return strg[ta];

	}
}
