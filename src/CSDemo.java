
/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 28-May-2019
 *
 */

public class CSDemo {

	public static void main(String[] args) {

		System.out.println("hi");

		// if (marks == 80 || pack >= 10) {
		// System.out.println("v good");
		// }

		// p = 24;
		//
		// if (marks == 80 && p >= 20) {
		// System.out.println("good");
		// } else {
		// System.out.println("bad");
		// }

		int marks = 75;
		int pack = 30;

		if (marks >= 80 || pack >= 20) {
			System.out.println("excellent");
		}

		else if (marks >= 80 && pack >= 10) {
			System.out.println("v good");
		}

		else if (marks >= 70 || pack >= 7) {
			System.out.println("good");
		}

		else {
			System.out.println("avg");
		}
		
		if(marks >= 80 && pack >= 10) {
			System.out.println("abc");
		}else {
			System.out.println("def");
		}

		System.out.println("bye");

	}
}
