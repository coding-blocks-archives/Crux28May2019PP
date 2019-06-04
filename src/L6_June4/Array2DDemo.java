package L6_June4;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jun-2019
 *
 */

public class Array2DDemo {

	public static void main(String[] args) {

		int[][] arr = null;
		System.out.println(arr);

		arr = new int[3][4];
		System.out.println(arr);

		System.out.println(arr.length); // rows
		System.out.println(arr[0].length); // cols

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// for(int[] val : arr) {
		//
		// for(int v : val) {
		// System.out.print(v + " ");
		// }
		//
		// System.out.println();
		// }

		arr[2][3] = 10;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();

		}

		System.out.println(" -- JA -- ");

		int[][] jarr = new int[3][];

		System.out.println(jarr);

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		jarr[0] = new int[2];
		jarr[1] = new int[5];
		jarr[2] = new int[3];

		System.out.println(jarr[0]);
		System.out.println(jarr[1]);
		System.out.println(jarr[2]);

		System.out.println(jarr[0].length);
		System.out.println(jarr[1].length);
		System.out.println(jarr[2].length);

	}
}
