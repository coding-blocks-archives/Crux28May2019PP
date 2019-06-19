package L9_June8;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 08-Jun-2019
 *
 */

public class RecursionGet {

	public static void main(String[] args) {

		// System.out.println(getSS("abc"));
		// System.out.println(getKPC("145").size());

		// System.out.println(getPermutation("abcd").size());

		// System.out.println(getCoinToss(3));

		// System.out.println(lowerUpperCase("1Z4c"));

		// System.out.println(boardPath(0, 10));

		// System.out.println(mazePath(0, 0, 2, 2));
		// System.out.println(mazePathD(0, 0, 2, 2));
		// System.out.println(mazePathDMM(0, 0, 2, 2));

		System.out.println(parenthesis("2*3-4*5"));

	}

	public static ArrayList<String> getSS(String str) {

		// base case
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		// smaller problem
		ArrayList<String> rr = getSS(ros); // bc

		// self work
		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {
			mr.add(val); // no
			mr.add(ch + val); // yes
			mr.add((int) ch + val);
		}

		return mr;

	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> getKPC(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getKPC(ros);

		ArrayList<String> mr = new ArrayList<>();

		String code = getCode(ch);

		for (int i = 0; i < code.length(); i++) {

			for (String val : rr) {
				mr.add(code.charAt(i) + val);

			}
		}

		return mr;

	}

	public static ArrayList<String> getPermutation(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = getPermutation(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			for (int i = 0; i <= val.length(); i++) {
				String ans = val.substring(0, i) + ch + val.substring(i);
				mr.add(ans);
			}

		}

		return mr;
	}

	public static ArrayList<String> getCoinToss(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> rr = getCoinToss(n - 1);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {
			mr.add("H" + val);
			mr.add("T" + val);
		}

		return mr;

	}

	public static ArrayList<String> lowerUpperCase(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rr = lowerUpperCase(ros);

		ArrayList<String> mr = new ArrayList<>();

		// self work
		for (String val : rr) {

			if (Character.isDigit(ch)) {
				mr.add(ch + val);
			} else {
				mr.add(Character.toLowerCase(ch) + val);
				mr.add(Character.toUpperCase(ch) + val);
			}

		}

		return mr;

	}

	public static ArrayList<String> boardPath(int curr, int end) {

		// +ve base case
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		// -ve base case
		if (curr >= end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> rr = boardPath(curr + dice, end);

			for (String val : rr) {
				mr.add(dice + val);
			}
		}

		return mr;

	}

	public static ArrayList<String> mazePath(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = mazePath(cr, cc + 1, er, ec);
		for (String val : rrh) {
			mr.add("H" + val);
		}

		ArrayList<String> rrv = mazePath(cr + 1, cc, er, ec);
		for (String val : rrv) {
			mr.add("V" + val);
		}

		return mr;

	}

	public static ArrayList<String> mazePathD(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = mazePathD(cr, cc + 1, er, ec);
		for (String val : rrh) {
			mr.add("H" + val);
		}

		ArrayList<String> rrv = mazePathD(cr + 1, cc, er, ec);
		for (String val : rrv) {
			mr.add("V" + val);
		}

		ArrayList<String> rrd = mazePathD(cr + 1, cc + 1, er, ec);
		for (String val : rrd) {
			mr.add("D" + val);
		}

		return mr;

	}

	public static ArrayList<String> mazePathDMM(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int step = 1; step <= ec; step++) {
			ArrayList<String> rrh = mazePathDMM(cr, cc + step, er, ec);
			for (String val : rrh) {
				mr.add("H" + step + val);
			}
		}

		for (int step = 1; step <= er; step++) {
			ArrayList<String> rrv = mazePathDMM(cr + step, cc, er, ec);
			for (String val : rrv) {
				mr.add("V" + step + val);
			}
		}

		for (int step = 1; step <= ec && step <= er; step++) {
			ArrayList<String> rrd = mazePathDMM(cr + step, cc + step, er, ec);
			for (String val : rrd) {
				mr.add("D" + step + val);
			}

		}
		return mr;

	}

	public static ArrayList<Integer> parenthesis(String str) {

		ArrayList<Integer> mr = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '+' || str.charAt(i) == '*' || str.charAt(i) == '-') {

				String fh = str.substring(0, i);
				String sh = str.substring(i + 1);

				ArrayList<Integer> rrfh = parenthesis(fh);
				ArrayList<Integer> rrsh = parenthesis(sh);

				// my result
				for (int val1 : rrfh) {
					for (int val2 : rrsh) {

						if (str.charAt(i) == '+') {
							mr.add(val1 + val2);
						} else if (str.charAt(i) == '-') {
							mr.add(val1 - val2);
						} else if (str.charAt(i) == '*') {
							mr.add(val1 * val2);
						}
					}
				}

			}

		}

		if (mr.size() == 0) {
			mr.add(Integer.parseInt(str));
		}

		return mr;

	}

}
