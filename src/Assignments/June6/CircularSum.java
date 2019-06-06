package Assignments.June6;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class CircularSum {

	public static void main(String[] args) {

		int[] arr = { 8, -8, 9, -9, 10, -11, 12 };

		int[] na = new int[2 * arr.length];

		for (int i = 0; i < arr.length; i++) {

			na[i] = arr[i];
			na[arr.length + i] = arr[i];
		}

		int ans = 0;

		// for (int si = 0; si <= arr.length - 1; si++) {
		//
		// for (int ei = si; ei <= arr.length - 1 + si; ei++) {
		//
		// int ps = 0;
		//
		// for (int k = si; k <= ei; k++) {
		// ps += na[k];
		// }
		//
		// // ans = Math.max(ans, ps);
		//
		// if (ps > ans) {
		// ans = ps;
		// }
		//
		// }
		//
		// }

		for (int si = 0; si <= arr.length - 1; si++) {

			int ps = 0;

			for (int ei = si; ei <= arr.length - 1 + si; ei++) {

				ps += na[ei];

				if (ps > ans) {
					ans = ps;
				}

				System.out.println("[" + si + "-" + ei + "] : " + ps);

			}

		}

		System.out.println(ans);

	}

}
