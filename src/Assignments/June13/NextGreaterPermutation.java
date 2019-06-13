package Assignments.June13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jun-2019
 *
 */

public class NextGreaterPermutation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int digit = 0;
		int[] arr = { 4, 8, 6, 9, 7, 3 };

		// no. position search
		for (int i = arr.length - 2; i >= 0; i--) {

			if (arr[i] < arr[i + 1]) {
				digit = i;
				break;
			}

		}

		// just larger
		int jl = digit + 1;

		for (int j = digit + 2; j < arr.length; j++) {

			if (arr[j] > arr[digit] && arr[j] < arr[jl]) {
				jl = j;
			}
		}

		// swap
		int temp = arr[digit];
		arr[digit] = arr[jl];
		arr[jl] = temp;

		// reverse
		int left = digit + 1;
		int right = arr.length - 1;

		while (left < right) {

			int t = arr[left];
			arr[left] = arr[right];
			arr[right] = t;

			left++;
			right--;
		}

		// print
		for (int val : arr) {
			System.out.print(val);
		}
		System.out.println();
	}
}
