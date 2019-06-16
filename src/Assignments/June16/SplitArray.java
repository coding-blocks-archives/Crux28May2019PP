package Assignments.June16;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class SplitArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 3, 4, 5 };
		splitArray(arr, 0, 0, "", 0, "");
	}

	public static void splitArray(int[] arr, int vidx, int g1sum, String g1str, int g2sum, String g2str) {

		if (vidx == arr.length) {

			if (g1sum == g2sum) {
				System.out.println(g1str + "and " + g2str);
			}

			return;
		}
		splitArray(arr, vidx + 1, g1sum + arr[vidx], g1str + arr[vidx] + " ", g2sum, g2str);
		splitArray(arr, vidx + 1, g1sum, g1str, g2sum + arr[vidx], g2str + arr[vidx] + " ");

	}
}
