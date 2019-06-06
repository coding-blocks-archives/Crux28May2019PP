package Assignments.June6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class MaxSumPath {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {

			int n1 = scn.nextInt();
			int n2 = scn.nextInt();

			int[] a1 = new int[n1];
			int[] a2 = new int[n2];

			for (int i = 0; i < a1.length; i++) {
				a1[i] = scn.nextInt();
			}

			for (int i = 0; i < a2.length; i++) {
				a2[i] = scn.nextInt();
			}

			int i = 0;
			int j = 0;
			int sum1 = 0;
			int sum2 = 0;

			int ans = 0;

			while (i < a1.length && j < a2.length) {

				if (a1[i] < a2[j]) {
					sum1 += a1[i];
					i++;
				} else if (a1[i] > a2[j]) {
					sum2 += a2[j];
					j++;
				} else {

					ans += Math.max(sum1, sum2);
					ans += a1[i]; // equal

					sum1 = 0;
					sum2 = 0;

					i++;
					j++;

				}

			}

			if (i == a1.length) {
				while (j < a2.length) {
					sum2 += a2[j];
					j++;
				}
			}

			if (j == a2.length) {
				while (i < a1.length) {
					sum1 += a1[i];
					i++;
				}
			}

			ans += Math.max(sum1, sum2);

			System.out.println(ans);

			tc--;
		}

	}
}
