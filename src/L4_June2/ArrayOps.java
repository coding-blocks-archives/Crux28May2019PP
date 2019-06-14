package L4_June2;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jun-2019
 *
 */

public class ArrayOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] array = takeInput();
		// int[] array = { 10, 20, 30 };

		// display(array);

		// System.out.println(max(array));
		// System.out.println(linearSearch(array, 30));
		// System.out.println(binarySearch(array, 30));

		// reverse(array);
		// int[] ans = inverse(array);
		// int[] ans = rotate(array, 4);

		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i ;
		}

		long start = System.currentTimeMillis();

		bubbleSort(arr);

		long end = System.currentTimeMillis();

		System.out.println(end - start);
		
		// bubbleSort(array);
		// selectionSort(array);
		// insertionSort(array);
		// subArrays(array);

		// subsets(array);

		// display(array);
	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static int max(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item) {
				return i;
			}
		}

		return -1;

	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (item > arr[mid]) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void reverse(int[] arr) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;

		}

	}

	public static int[] inverse(int[] arr) {

		int[] inv = new int[arr.length];

		for (int i = 0; i < inv.length; i++) {
			inv[arr[i]] = i;
		}

		return inv;

	}

	public static int[] rotate(int[] arr, int r) {

		r = r % arr.length;

		if (r < 0) {
			r = r + arr.length;
		}

		int[] ans = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {

			if (i <= r - 1) {
				ans[i] = arr[i + arr.length - r];
			} else {
				ans[i] = arr[i - r];
			}

		}

		return ans;

	}

	public static void bubbleSort(int[] arr) {

		int n = arr.length;

		boolean flag = true;

		for (int counter = 0; counter <= n - 2; counter++) {

			for (int j = 0; j <= n - counter - 2; j++) {

				if (arr[j] > arr[j + 1]) {

					flag = false;

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

			if (flag)
				break;

		}

	}

	public static void selectionSort(int[] arr) {

		int n = arr.length;

		for (int counter = 0; counter <= n - 2; counter++) {

			int min = counter;

			// find min in rest of the array
			for (int j = counter + 1; j <= arr.length - 1; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// swap
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}

	}

	public static void insertionSort(int[] arr) {

		for (int counter = 1; counter < arr.length; counter++) {

			int temp = arr[counter];

			int j = counter - 1;

			while (j >= 0 && arr[j] >= temp) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;

		}

	}

	public static void subArrays(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= arr.length - 1; ei++) {

				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}

				System.out.println();
			}
		}

	}

	public static void subsets(int[] arr) {

		int limit = (int) (Math.pow(2, arr.length));

		for (int num = 0; num < limit; num++) {

			int temp = num;
			for (int i = 0; i < arr.length; i++) {

				int rem = temp % 2;
				temp = temp / 2;

				if (rem > 0) {
					System.out.print(arr[i] + " ");
				}

			}

			System.out.println();
		}

	}

}
