package Assignments.June6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class PainterPartition {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int nop = scn.nextInt();
		int nob = scn.nextInt();

		long[] boards = new long[nob];

		for (int i = 0; i < boards.length; i++) {
			boards[i] = scn.nextLong();
		}

		int finalAns = 0;

		int lo = 0;
		int hi = 0;

		for (long val : boards) {
			hi += val;
		}

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(nop, nob, boards, mid)) {
				finalAns = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int nop, int nob, long[] boards, int mid) {

		int numPainters = 1;
		int time = 0;

		int i = 0;

		while (i < boards.length) {

			if (time + boards[i] <= mid) {
				time += boards[i];
				i++;
			} else {
				numPainters++;
				time = 0;

				if (numPainters > nop) {
					return false;
				}
			}

		}

		return true;

	}
}
