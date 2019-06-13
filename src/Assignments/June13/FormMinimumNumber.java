package Assignments.June13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jun-2019
 *
 */

public class FormMinimumNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.next();
		int[] ans = new int[str.length() + 1];

		int count = 1;

		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {

				ans[i] = count++;

				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					ans[j] = count++;
				}

			}

		}

		for (int val : ans) {
			System.out.print(val);
		}
		System.out.println();

	}
}
