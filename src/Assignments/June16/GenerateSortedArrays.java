package Assignments.June16;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 16-Jun-2019
 *
 */

public class GenerateSortedArrays {

	public static void main(String[] args) {

		int[] A = { 10, 15, 25 };
		int[] B = { 1, 5, 20, 30 };

		int[] C = new int[A.length + B.length];

		sortedArrays(A, 0, B, 0, C, 0, true);
	}

	public static void sortedArrays(int[] A, int avidx, int[] B, int bvidx, int[] C, int cvidx, boolean flag) {

		// flag : true : A
		// flag : false : B
		if (flag) {

			for (int i = avidx; i < A.length; i++) {

				if (cvidx == 0 || A[i] > C[cvidx - 1]) {
					C[cvidx] = A[i];
					sortedArrays(A, i + 1, B, bvidx, C, cvidx + 1, !flag);
				}

			}
		} else {

			for (int i = bvidx; i < B.length; i++) {

				if (B[i] > C[cvidx - 1]) {
					C[cvidx] = B[i];

					display(C, cvidx);

					sortedArrays(A, avidx, B, i + 1, C, cvidx + 1, !flag);

				}

			}
		}

	}

	public static void display(int[] C, int vidx) {

		for (int i = 0; i <= vidx; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();
	}

}
