package Assignments.June16;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class FormMinimumNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		while (n > 0) {
			
			String str = scn.next();

			int count = 1;

			int[] arr = new int[str.length() + 1];

			for (int i = 0; i <= str.length(); i++) {

				if (i == str.length() || str.charAt(i) == 'I') {

					arr[i] = count++;

					for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
						arr[j] = count++;
					}

				}

			}

			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();

			n--;
		}

	}
}
