package L2_May29;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-May-2019
 *
 */

public class DecimalToBinary {

	public static void main(String[] args) {

		int n = 15;

		int ans = 0;
		int multiplier = 1; // 10 ^ 0

		while (n != 0) {

			int rem = n % 2;

			ans = ans + (rem * multiplier);

			multiplier = multiplier * 10;
			n = n / 2;

		}

		System.out.println(ans);

	}
}
