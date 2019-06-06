package Assignments.June6;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class RainWaterTrapping {

	public static void main(String[] args) {

		int[] arr = {};

		int[] lm = new int[arr.length];

		lm[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			lm[i] = Math.max(lm[i - 1], arr[i]);
		}

		int[] rm = new int[arr.length];
		rm[rm.length - 1] = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			rm[i] = Math.max(rm[i + 1], arr[i]);
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += Math.min(lm[i], rm[i]) - arr[i];
		}

		System.out.println(sum);
	}

}
