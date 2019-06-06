package Assignments.June6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class TargetTriplet {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int target = scn.nextInt();

		Arrays.sort(arr);

		for (int i = 0; i <= arr.length - 1; i++) {

			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {

				if (arr[i] + arr[j] + arr[k] > target) {
					k--;
				} else if (arr[i] + arr[j] + arr[k] < target) {
					j++;
				} else {

					System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);

					j++;
					k--;
				}

			}

		}

	}
}
