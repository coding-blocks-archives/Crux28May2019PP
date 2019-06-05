package L7_June5;

import java.util.Scanner;

import L6_June4.ArrayListOps;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jun-2019
 *
 */

public class StringOps {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		// String str = scn.next();

		// printChars(str);
		// System.out.println(palindrome("nitin"));
		// substrings("block");
		// System.out.println(palindromicSubstrings("nitin"));

		int t = 0;
		while (t > 0) {
			int[] arr = { 8, 85, 89, 889, 897, 899, 859 };
			bubbleSort(arr);

			for (int val : arr) {
				System.out.print(val);
			}
			t--;
		}
		System.out.println();
	}

	public static void printChars(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

		}

	}

	public static boolean palindrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}

		return true;
	}

	public static void substrings(String str) {

		for (int si = 0; si < str.length(); si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String ss = str.substring(si, ei);
				System.out.println(ss);
			}
		}

	}

	public static int palindromicSubstrings(String str) {

		int count = 0;

		for (int si = 0; si < str.length(); si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {

				String ss = str.substring(si, ei);

				boolean res = palindrome(ss);
				if (res) {
					count++;
				}
			}
		}

		return count;
	}

	public static void bubbleSort(int[] arr) {

		int n = arr.length;

		for (int counter = 0; counter <= n - 2; counter++) {

			for (int j = 0; j <= n - counter - 2; j++) {

				if (compare(arr[j], arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static boolean compare(int n1, int n2) {

		String n1n2s = n1 + "" + n2;
		String n2n1s = n2 + "" + n1;

		int n1n2n = Integer.parseInt(n1n2s);
		int n2n1n = Integer.parseInt(n2n1s);

		if (n1n2n > n2n1n) {
			return false;
		} else {
			return true;
		}

	}

}
