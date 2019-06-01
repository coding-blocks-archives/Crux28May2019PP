package Assignments.June1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class DelhisOddEven {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {

			int num = scn.nextInt();

			int os = 0;
			int es = 0;

			while (num != 0) {

				int rem = num % 10;

				if (rem % 2 == 0) {
					es += rem;
				} else {
					os += rem;
				}

				num = num / 10;

			}

			if (es % 4 == 0 || os % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

			tc--;
		}

	}
}
