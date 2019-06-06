package Assignments.June6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class PairOfRoses {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int target = scn.nextInt();

			Arrays.sort(arr);

			int fi = 0;
			int fj = 0;

			int i = 0;
			int j = arr.length - 1;

			while (i < j) {

				if (arr[i] + arr[j] > target) {
					j--;
				} else if (arr[i] + arr[j] < target) {
					i++;
				} else {

					fi = i;
					fj = j;
					i++;
					j--;
				}

			}

			System.out.println("Deepak should buy roses whose prices are " + arr[fi] + " and " + arr[fj] + ".");

			tc--;
		}
	}
}
