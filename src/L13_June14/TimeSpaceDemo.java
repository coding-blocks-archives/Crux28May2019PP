package L13_June14;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 14-Jun-2019
 *
 */

public class TimeSpaceDemo {

	public static void main(String[] args) {

		// System.out.println(polynomial(3, 5));
		System.out.println(palindromicCount("nitinn"));
	}

	public static int polynomial(int x, int n) {

		int sum = 0;
		int multiplier = x;

		for (int i = n; i >= 1; i--) {

			sum = sum + i * multiplier;
			multiplier *= x;

		}

		return sum;

	}

	public static int palindromicCount(String str) {

		int count = 0;

		// odd length ss
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}

		}

		// even
		for (double axis = 0.5; axis < str.length(); axis++) {

			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}
			}

		}

		return count;

	}

}
