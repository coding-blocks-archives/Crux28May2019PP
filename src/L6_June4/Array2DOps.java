package L6_June4;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jun-2019
 *
 */

public class Array2DOps {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[][] array = takeInput();

//		int[][] array = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 },
//				{ 19, 20, 21, 22, 23, 24 }, { 25, 26, 27, 28, 29, 30 } };
		// display(array);

		// verticalDisplay(array);
		// waveDisplay(array);
//		spiralDisplay(array);
		
		int[][] one = {{1,2,3} , {4,5,6} } ;
		int[][] two = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12}} ;
		
		display(matrixMultiplication(one, two));
	}

	// jagged array input
	public static int[][] takeInput() {

		System.out.println("Rows ?");
		int rows = scn.nextInt();

		int[][] arr = new int[rows][];

		// loop on rows
		for (int r = 0; r < arr.length; r++) {

			// take input for no. of cols
			System.out.println("Cols for " + r + " row ?");
			int cols = scn.nextInt();

			// instead of null point to some array
			arr[r] = new int[cols];

			// input of values
			for (int c = 0; c < arr[r].length; c++) {
				System.out.println("[" + r + "-" + c + "] ?");
				arr[r][c] = scn.nextInt();
			}

		}

		return arr;

	}

	public static void display(int[][] arr) {

		for (int r = 0; r < arr.length; r++) {

			for (int c = 0; c < arr[r].length; c++) {
				System.out.print(arr[r][c] + " ");
			}

			System.out.println();
		}
	}

	public static void verticalDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			for (int r = 0; r < arr.length; r++) {
				System.out.print(arr[r][c] + " ");
			}
		}
	}

	public static void waveDisplay(int[][] arr) {

		for (int c = 0; c < arr[0].length; c++) {

			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}
		}

	}

	public static void spiralDisplay(int[][] arr) {

		int count = 0;
		int nel = arr.length * arr[0].length;

		int minRow = 0;
		int maxRow = arr.length - 1;

		int minCol = 0;
		int maxCol = arr[0].length - 1;

		while (count < nel) {

			// first col
			for (int r = minRow; r <= maxRow && count < nel; r++) {
				System.out.print(arr[r][minCol] + " ");
				count++;
			}
			minCol++;

			// last row
			for (int c = minCol; c <= maxCol && count < nel; c++) {
				System.out.print(arr[maxRow][c] + " ");
				count++;
			}
			maxRow--;

			// last col
			for (int r = maxRow; r >= minRow && count < nel; r--) {
				System.out.print(arr[r][maxCol] + " ");
				count++;
			}
			maxCol--;

			// first row
			for (int c = maxCol; c >= minCol && count < nel; c--) {
				System.out.print(arr[minRow][c] + " ");
				count++;
			}
			minRow++;

		}
	}

	public static int[][] matrixMultiplication(int[][] one, int[][] two) {

		int r1 = one.length;
		int r2 = two.length;
		int c1 = one[0].length;
		int c2 = two[0].length;

		int[][] res = new int[r1][c2];

		for (int i = 0; i < res.length; i++) {

			for (int j = 0; j < res[0].length; j++) {

				int ans = 0;
				for (int k = 0; k < c1; k++) {
					ans += one[i][k] * two[k][j];
				}

				res[i][j] = ans;

			}
		}

		return res;

	}

}
