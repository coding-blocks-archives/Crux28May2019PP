package Assignments.June6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class BookAllocation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int nob = scn.nextInt();
			int nos = scn.nextInt();

			long[] pages = new long[nob];

			for (int i = 0; i < pages.length; i++) {
				pages[i] = scn.nextLong();
			}

			int finalAns = 0;

			int lo = 0;
			int hi = 0;

			for (long val : pages) {
				hi += val;
			}

			while (lo <= hi) {

				int mid = (lo + hi) / 2;

				if (isItPossible(nob, nos, pages, mid)) {
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

	public static boolean isItPossible(int nob, int nos, long[] pages, int mid) {

		int numStudents = 1;
		int pagesRead = 0;

		int i = 0;

		while (i < pages.length) {

			if (pagesRead + pages[i] <= mid) {
				pagesRead += pages[i];
				i++;
			} else {
				numStudents++;
				pagesRead = 0;

				if (numStudents > nos) {
					return false;
				}
			}

		}

		return true;

	}
}
