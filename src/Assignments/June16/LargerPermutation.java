package Assignments.June16;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class LargerPermutation {

	public static void main(String[] args) {

		permutation("bacd", "", false);
	}

	public static void permutation(String ques, String ans, boolean isLarger) {

		if (ques.length() == 0) {

			if (isLarger)
				System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			String roq = ques.substring(0, i) + ques.substring(i + 1);

			if (isLarger) {
				permutation(roq, ans + ch, true);
			} else {
				if (ch < ques.charAt(0)) {

				} else if (ch > ques.charAt(0)) {
					permutation(roq, ans + ch, true);
				} else {
					permutation(roq, ans + ch, false);
				}
			}
		}

	}
}
