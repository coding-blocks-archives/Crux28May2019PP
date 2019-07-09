package L33_July9.OverloadingStory;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 09-Jul-2019
 *
 */

public class OverloadingDemo {

	public static void main(String[] args) {

		for (String val : args) {
			System.out.println(val);
		}

		sum(2, 3);
		int ans = sum(2, 3);
		sum(2, 3, 4);
		sum(2.3, 4.5);

		sum(2, 3, 4, 5);
	}

	public static void sum(int a, int b, int... args) {

		System.out.println(" in var args");
		for (int val : args) {
			System.out.println(val);
		}

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void sum(double a, double b) {
		System.out.println(a + b);
	}

}
