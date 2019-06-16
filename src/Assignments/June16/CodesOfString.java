package Assignments.June16;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class CodesOfString {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		printCS("1128", "", list);

		System.out.println(list);
	}

	// ques : 1125
	public static void printCS(String ques, String ans, ArrayList<String> list) {

		if (ques.length() == 0) {
			list.add(ans);
			return;
		}

		// one char
		String sch1 = ques.substring(0, 1); // 1
		String roq1 = ques.substring(1); // 125

		int ich1 = Integer.parseInt(sch1); // 1 + 'a' - 1 -> 97
		char ch1 = (char) (ich1 + 'a' - 1); // a

		printCS(roq1, ans + ch1, list);

		// two char

		if (ques.length() >= 2) {
			String sch2 = ques.substring(0, 2); // 11
			String roq2 = ques.substring(2); // 25

			int ich2 = Integer.parseInt(sch2); // 11 + 'a' - 1 -> k ascii
			char ch2 = (char) (ich2 + 'a' - 1); // k

			if (ich2 <= 26)
				printCS(roq2, ans + ch2, list);

		}

	}
}
