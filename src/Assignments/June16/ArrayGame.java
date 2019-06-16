package Assignments.June16;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class ArrayGame {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] arr = { 4, 1, 0, 1, 1, 0, 1 };

		System.out.println(arrayGame(arr, 0, arr.length - 1));

	}

	public static int arrayGame(int[] arr, int si, int ei) {

		for (int i = si; i < ei; i++) {

			int fh = 0;
			for (int j = si; j <= i; j++) {
				fh += arr[j];
			}

			int sh = 0;
			for (int j = i + 1; j <= ei; j++) {
				sh += arr[j];
			}

			if (fh == sh) {

				int ans1 = arrayGame(arr, si, i);
				int ans2 = arrayGame(arr, i + 1, ei);

				return Math.max(ans1, ans2) + 1;
			}

		}

		return 0;
	}

}
