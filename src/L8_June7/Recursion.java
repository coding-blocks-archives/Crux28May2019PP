package L8_June7;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 07-Jun-2019
 *
 */

public class Recursion {

	public static void main(String[] args) {

		// PDISkips(9);
		// System.out.println(factorial(5));

		int[] arr = { 10, 20, 30, 40, 50, 30, 30 };
		// displayArrRev(arr, 0);
		System.out.println(firstIndex(arr, 0, 30));
		System.out.println(lastIndex(arr, 0, 30));

		int[] ans = allIndex(arr, 0, 30, 0);

		for (int val : ans) {
			System.out.print(val + " ");
		}
	}

	public static void PD(int n) {

		if (n == 0) {
			return;
		}

		// self work
		System.out.println(n);

		// samller problem
		PD(n - 1);

	}

	public static void PI(int n) {

		// base case
		if (n == 0) {
			return;
		}

		// smller problem
		PI(n - 1);

		// self work
		System.out.println(n);

	}

	public static void PDI(int n) {

		if (n == 0) {
			return;
		}

		System.out.println("Hi " + n);

		// sp
		PDI(n - 1);

		System.out.println("Bye " + n);
	}

	public static void PDISkips(int n) {

		if (n == 0) {
			return;
		}

		if (n % 2 != 0)
			System.out.println(n);

		// sp
		PDISkips(n - 1);

		if (n % 2 == 0)
			System.out.println(n);
	}

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		}

		// smaller problem
		int fnm1 = factorial(n - 1);

		// self work
		int fn = fnm1 * n;

		return fn;
	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		// sp
		int sp = power(x, n - 1);

		// sw
		int bp = sp * x;

		return bp;

	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;

	}

	public static void displayArr(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		System.out.println(arr[vidx]);

		displayArr(arr, vidx + 1);

	}

	public static void displayArrRev(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return;
		}

		displayArrRev(arr, vidx + 1);

		System.out.println(arr[vidx]);

	}

	public static int max(int[] arr, int vidx) {

		if (vidx == arr.length) {
			return Integer.MIN_VALUE;
		}

		int recRes = max(arr, vidx + 1);

		// if (recRes > arr[vidx]) {
		// return recRes;
		// } else {
		// return arr[vidx];
		// }

		return Math.max(recRes, arr[vidx]);

	}

	public static int firstIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		if (arr[vidx] == item) {
			return vidx;
		} else {
			return firstIndex(arr, vidx + 1, item);
		}

	}

	public static int lastIndex(int[] arr, int vidx, int item) {

		if (vidx == arr.length) {
			return -1;
		}

		int ans = lastIndex(arr, vidx + 1, item);

		if (arr[vidx] == item && ans == -1) {
			return vidx;
		}

		return ans;

	}

	public static int[] allIndex(int[] arr, int vidx, int item, int count) {

		if (vidx == arr.length) {
			int[] br = new int[count];
			return br;
		}

		int[] rr;
		if (arr[vidx] == item) {
			rr = allIndex(arr, vidx + 1, item, count + 1);
			rr[count] = vidx;
		} else {
			rr = allIndex(arr, vidx + 1, item, count);
		}
		return rr;

	}

}
