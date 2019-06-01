package Assignments.June1;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 01-Jun-2019
 *
 */

public class ShoppingGame {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		for (int ptc = 1; ptc <= tc; ptc++) {

			int aLimit = scn.nextInt();
			int hLimit = scn.nextInt();

			int aCount = 0;
			int hCount = 0;

			int i = 1;

			while (true) {

				// aayush
				if (i % 2 != 0) {

					if (aCount + i <= aLimit) {
						aCount = aCount + i;
					} else {
						System.out.println("Harshit");
						break;
					}

				} else { // harshit

					if (hCount + i <= hLimit) {
						hCount = hCount + i;
					} else {
						System.out.println("Aayush");
						break;
					}

				}

				i++;

			}

		}
	}
}
