package L25_June30.InterfaceStory;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 30-Jun-2019
 *
 */

public class FxnGeneric {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 30, 40 };
		display(arr);

		String[] arrs = { "hello", "hi", "bye" };
		display(arrs);

	}

	public static void display(Integer[] arr) {

		System.out.println("in display");

		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static <T> void display(T[] arr) {

		for (T val : arr) {
			System.out.println(val);
		}

	}

}
