package L14_June18;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 18-Jun-2019
 *
 */

public class DivideConquer {

	static int count = 0;

	public static void main(String[] args) {

		int[] arr = { 4, 2, 3, 1, 5 };

		// int[] ans = mergeSort(arr, 0, arr.length - 1);
		quickSort(arr, 0, arr.length - 1);

		for (int val : arr) {
			System.out.print(val + " ");
		}
		// System.out.println(count);
	}

	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

		int[] ans = new int[one.length + two.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] <= two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {

				count += one.length - i;
				for (int c = i; c < one.length; c++)
					System.out.println(one[c] + " " + two[j]);

				ans[k] = two[j];
				j++;
				k++;
			}

		}

		if (i == one.length) {
			while (j < two.length) {
				ans[k] = two[j];
				j++;
				k++;
			}
		}

		if (j == two.length) {
			while (i < one.length) {
				ans[k] = one[i];
				i++;
				k++;
			}
		}

		return ans;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr, mid + 1, hi);

		int[] merged = mergeTwoSortedArrays(fh, sh);

		return merged;

	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;

		int pivot = arr[mid];

		int left = lo;
		int right = hi;

		while (left <= right) {

			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}

		}

		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}
}
