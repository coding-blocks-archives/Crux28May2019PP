package Assignments.June13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jun-2019
 *
 */

public class IncDec {

	public static void main(String[] args) {

		System.out.println(incdec());
	}

	public static boolean incdec() {

		Scanner scn = new Scanner(System.in);

		boolean flag = true; // dec
		int n = scn.nextInt();

		int prev = scn.nextInt();

		for (int i = 1; i <= n - 1; i++) {
			int curr = scn.nextInt();

			if (flag) {

				if (prev > curr) {

				} else {
					flag = false;
				}

			} else {

				if (prev < curr) {

				} else {
					return false;
				}

			}

			prev = curr;

		}

		return true;

	}
}
