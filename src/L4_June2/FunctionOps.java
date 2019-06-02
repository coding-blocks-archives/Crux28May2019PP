package L4_June2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jun-2019
 *
 */

public class FunctionOps {

	public static void main(String[] args) {

		// printAllPrimes(10, 50);

		printAllArmstrong(1, 1000);
	}

	public static void printAllPrimes(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			if (isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div <= n - 1) {

			if (n % div == 0) {
				return false;
			}

			div++;
		}

		return true;

	}

	public static void printAllArmstrong(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArmstrong(int n) {

		int nod = countDigits(n);

		int temp = n;
		int ans = 0;

		while (n != 0) {
			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			n = n / 10;
		}

		if (ans == temp) {
			return true;
		} else {
			return false;
		}

	}

	public static int countDigits(int n) {

		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}

		return count;

	}

}
