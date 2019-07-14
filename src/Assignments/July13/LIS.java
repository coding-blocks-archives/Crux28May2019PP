package Assignments.July13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jul-2019
 *
 */

public class LIS {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int[] strg = new int[n];

		for (int i = 0; i < strg.length; i++) {

			strg[i] = 1;

			for (int j = 0; j < i; j++) {

				if (arr[j] < arr[i]) {
					strg[i] = Math.max(strg[i], strg[j] + 1);
				}

			}

		}

		int max = Integer.MIN_VALUE;

		for (int val : strg) {
			max = Math.max(max, val);
		}

		System.out.println(max);

	}
}
