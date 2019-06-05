package L7_June5;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jun-2019
 *
 */

public class StringDemo {

	public static void main(String[] args) {

		String str = "hellobye";
		String s11 = "bye";

		Scanner scn = new Scanner(System.in);
		// String s12 = scn.nextLine();

		System.out.println(str);

		// length
		System.out.println(str.length());

		// charAt : limit : 0 -> length-1
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(str.length() - 1));

		// substring : limit : 0 -> length
		System.out.println(str.substring(2, 6));
		System.out.println(str.substring(1, 6)); // ellob
		System.out.println(str.substring(0, 7)); // helloby
		System.out.println(str.substring(0, 8)); // hellobye
		System.out.println(str.substring(5, 5)); // length : 0
		// System.out.println(str.substring(7, 3)); // error
		System.out.println(str.substring(1)); // ellobye

		// Part-4 : Concatenate Two Strings
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + ", " + s2 + ", " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + ", " + s2 + ", " + s4);

		// Part-5 : IndexOf
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("eL"));

		// Part-6 : StartsWith
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.startsWith("hello"));

		// Part-7 : Equals and ==
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2) + ", " + s1.equals(s2));
		System.out.println((s1 == s3) + ", " + s1.equals(s3));
		System.out.println((s1 == s4) + ", " + s1.equals(s4));

		s1 = "hello";

		s1 = s1.replace("l", "r");

		System.out.println(s1);

		appendString();

	}

	public static void appendString() {

		long start = System.currentTimeMillis();

		// String str = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10000000; i++) {
			// str += i;
			sb.append(i);
		}

		// System.out.println(str);
		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}

}
