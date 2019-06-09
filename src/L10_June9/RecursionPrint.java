package L10_June9;

import L9_June8.RecursionGet;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Jun-2019
 *
 */

public class RecursionPrint {

	public static void main(String[] args) {

		// printSS("abc", "");
		// printKPC("145", "");
		// printPermutation("abc", "");
		validParenthesis(3, 0, 0, "");

	}

	public static void printSS(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		printSS(roq, ans); // no
		printSS(roq, ans + ch); // yes

	}

	public static void printKPC(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		String code = RecursionGet.getCode(ch);

		for (int i = 0; i < code.length(); i++) {
			printKPC(roq, ans + code.charAt(i));
		}
	}

	public static void printPermutation(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			String roq = ques.substring(0, i) + ques.substring(i + 1);
			printPermutation(roq, ans + ques.charAt(i));
		}
	}

	public static void validParenthesis(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		validParenthesis(n, open + 1, close, ans + "(");
		validParenthesis(n, open, close + 1, ans + ")");
	}

	public static void boardPath(int curr, int end) {

	}

	public static void mazePath(int cr, int cc, int er, int ec) {

	}

	public static void lexicoCounting(int curr, int end) {

	}

}
