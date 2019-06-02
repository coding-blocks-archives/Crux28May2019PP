package L4_June2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jun-2019
 *
 */

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = null;
		System.out.println(arr);

		arr = new int[5];
		System.out.println(arr);

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// get
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// length
		System.out.println(arr.length);

		// loop
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);

			// arr[i] = 1000;
		}

		System.out.println("-- EFL -- ");

		// enhanced for loop
		// forward only
		// read only
		for (int val : arr) {
			System.out.println(val);

			// val = 2000;
			// System.out.println(val);
			// arr[4] = 90;

		}

		int i = 0, j = 2;

		// non working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		// working swap
		System.out.println(arr[i] + ", " + arr[j]);
		Swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		int[] other = new int[3];
		other[0] = 100;
		other[1] = 200;
		other[2] = 300;

		// int[] other = {100,200, 300} ;

		System.out.println(arr[0] + ", " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);

	}

	public static void Swap(int[] one, int[] two) {
		int temp = one[0];
		one[0] = two[0];
		two[0] = temp;
	}

	public static void Swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + ", " + arr[j]);

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		System.out.println(arr[i] + ", " + arr[j]);
	}

	public static void Swap(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}
}
