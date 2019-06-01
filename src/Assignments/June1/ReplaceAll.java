package Assignments.June1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class ReplaceAll {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();
		long ans = 0;

		long count = 1;

		if (n == 0) {
			System.out.print(5);
		} else {

			while (n != 0) {

				long rem = n % 10;

				if (rem == 0) {
					rem = 5;
				}

				ans = ans + rem * count;

				count = count * 10;

				n = n / 10;
			}

			System.out.println(ans);
		}

	}
}
