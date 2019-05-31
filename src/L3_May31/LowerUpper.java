package L3_May31;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-May-2019
 *
 */

public class LowerUpper {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		char ch = scn.next().charAt(0);

		System.out.println(ch);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Upper");
		} else {
			System.out.println("Invalid");
		}

		if (Character.isLowerCase(ch)) {
			System.out.println("lower");
		} else if (Character.isUpperCase(ch)) {
			System.out.println("Upper");
		} else {
			System.out.println("Invalid");
		}

	}

}
