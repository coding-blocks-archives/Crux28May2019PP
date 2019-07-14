package Assignments.July13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jul-2019
 *
 */

public class UglyNumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long tc = scn.nextLong();

		while (tc > 0) {
			int n = scn.nextInt();

			long[] arr = new long[n];

			arr[0] = 1;

			int i2 = 0;
			int i3 = 0;
			int i5 = 0;

			for (int i = 1; i < n; i++) {

				long min = Math.min(2 * arr[i2], Math.min(3 * arr[i3], 5 * arr[i5]));

				arr[i] = min;

				if (min == 2 * arr[i2]) {
					i2++;
				}

				if (min == 3 * arr[i3]) {
					i3++;
				}

				if (min == 5 * arr[i5]) {
					i5++;
				}

			}

			System.out.println(arr[n - 1]);
			tc--;
		}
	}
}
