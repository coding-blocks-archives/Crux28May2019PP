package Assignments.June6;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 06-Jun-2019
 *
 */

public class HelpRamu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int nor = scn.nextInt();
			int noc = scn.nextInt();

			int[] rickshaw = new int[nor];

			for (int i = 0; i < rickshaw.length; i++) {
				rickshaw[i] = scn.nextInt();
			}

			int[] cabs = new int[noc];

			for (int i = 0; i < cabs.length; i++) {
				cabs[i] = scn.nextInt();
			}

			System.out.println(minFare(c1, c2, c3, c4, rickshaw, cabs));

			tc--;
		}

	}

	public static int minFare(int c1, int c2, int c3, int c4, int[] rickshaw, int[] cabs) {

		int minFareRickshaw = minFareTransport(c1, c2, c3, rickshaw);
		int minFareCabs = minFareTransport(c1, c2, c3, cabs);

		int ans = Math.min(minFareRickshaw + minFareCabs, c4);

		return ans;

	}

	public static int minFareTransport(int c1, int c2, int c3, int[] freq) {

		int sum = 0;

		for (int i = 0; i < freq.length; i++) {
			sum += Math.min(freq[i] * c1, c2);
		}

		return Math.min(sum, c3);

	}
}
