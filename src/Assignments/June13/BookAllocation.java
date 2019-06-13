package Assignments.June13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jun-2019
 *
 */

public class BookAllocation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int nob = scn.nextInt();
			int nos = scn.nextInt();

			int[] arr = new int[nob];

			int hi = 0;

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
				hi += arr[i];
			}

			int finalAns = 0;

			int lo = 0;

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(arr, nob, nos, mid)) {
					finalAns = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}

			}

			System.out.println(finalAns);
			tc--;
		}

	}

	public static boolean isItPossible(int[] arr, int nob, int nos, int mid) {

		int pagesRead = 0;
		int students = 1;

		int i = 0;

		while (i < arr.length) {

			if (pagesRead + arr[i] <= mid) {
				pagesRead += arr[i];
				i++;
			} else {
				students++;
				pagesRead = 0;

				if (students > nos) {
					return false;
				}
			}

		}

		return true;
	}

}
