package Assignments.June16;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class KSwaps {

	static int ans ;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt() ;
		
		char[] arr = str.toCharArray();

		ans = Integer.parseInt(str) ;
		
		kswap(arr, k);
		
		System.out.println(ans);

	}

	public static void kswap(char[] arr, int k) {

		if (k == 0) {
			return;
		}

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					swap(arr, i, j);

					getAns(arr);

					kswap(arr, k - 1);

					swap(arr, i, j);

				}
			}
		}

	}

	public static void getAns(char[] arr) {

		String str = new String(arr);
		// ans = Math.max(ans, Integer.parseInt(str));

		if (Integer.parseInt(str) > ans) {
			ans = Integer.parseInt(str);
		}

	}

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
