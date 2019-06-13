package Assignments.June13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jun-2019
 *
 */

public class StringCompression {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int c = 1;
		String str = scn.next() + "$";
		String ans = "";

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				c++;
			} else {
				ans += str.charAt(i);

				if (c > 1)
					ans += c;

				c = 1;
			}

		}

		System.out.println(ans);

	}
}
