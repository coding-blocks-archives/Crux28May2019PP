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

		int[] arr = { -2, 1, -3, 4, -1, 2, 100, -5, 4 };

		// int[] ans = mergeSort(arr, 0, arr.length - 1);
		// quickSort(arr, 0, arr.length - 1);

		// for (int val : arr) {
		// System.out.print(val + " ");
		// }
		// System.out.println(count);

		int[] ans = maxSubArraySum(arr, 0, arr.length - 1);
		System.out.println(ans[0]);
		System.out.println(ans[1]);
		System.out.println(ans[2]);
	
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

	public static int[] maxSubArraySum(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[3];

			br[0] = lo;
			br[1] = hi;
			br[2] = arr[lo];

			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fh = maxSubArraySum(arr, lo, mid);
		int[] sh = maxSubArraySum(arr, mid + 1, hi);

		int partition = maxSumLeftPart(arr, lo, mid) + maxSumRightPart(arr, mid + 1, hi);

		int[] ans = new int[3];

		if (partition > fh[2] && partition > sh[2]) {

			ans[0] = maxSumLeftIndex(arr, lo, mid);
			ans[1] = maxSumRightIndex(arr, mid + 1, hi);

		} else if (fh[2] > partition && fh[2] > sh[2]) {
			ans[0] = fh[0];
			ans[1] = fh[1];

		} else if (sh[2] > partition && sh[2] > fh[2]) {

			ans[0] = sh[0];
			ans[1] = sh[1];
		}

		ans[2] = Math.max(partition, Math.max(fh[2], sh[2]));

		return ans;

	}

	public static int maxSumLeftIndex(int[] arr, int lo, int hi) {
		int max = Integer.MIN_VALUE;

		int index = 0;
		int sum = 0;

		for (int i = hi; i >= lo; i--) {
			sum += arr[i];

			if (sum > max) {
				max = sum;
				index = i;
			}

		}

		return index;
	}

	public static int maxSumRightIndex(int[] arr, int lo, int hi) {
		int max = Integer.MIN_VALUE;

		int index = 0;
		int sum = 0;

		for (int i = lo; i <= hi; i++) {
			sum += arr[i];

			if (sum > max) {
				max = sum;
				index = i;
			}

		}

		return index;
	}

	public static int maxSumLeftPart(int[] arr, int lo, int hi) {
		int max = Integer.MIN_VALUE;

		int sum = 0;

		for (int i = hi; i >= lo; i--) {
			sum += arr[i];

			if (sum > max) {
				max = sum;
			}

		}

		return max;
	}

	public static int maxSumRightPart(int[] arr, int lo, int hi) {
		int max = Integer.MIN_VALUE;

		int sum = 0;

		for (int i = lo; i <= hi; i++) {
			sum += arr[i];

			if (sum > max) {
				max = sum;
			}

		}

		return max;
	}

	public static boolean search2D(int[][] arr, int target) {

		int row = 0;
		int col = arr[0].length - 1;

		while (row < arr.length && col >= 0) {

			if (arr[row][col] > target) {
				col--;
			} else if (arr[row][col] < target) {
				row++;
			} else {
				return true;
			}

		}

		return false;

	}

}
