package L3_May31;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-May-2019
 *
 */

public class Inverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int ans = 0;

		int place = 1;
		while (n != 0) {

			int rem = n % 10;

			ans = ans + place * (int) Math.pow(10, rem - 1);

			place = place + 1;
			n = n / 10;

		}

		System.out.println(ans);

	}
}
