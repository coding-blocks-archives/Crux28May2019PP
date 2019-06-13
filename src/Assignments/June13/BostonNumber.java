package Assignments.June13;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Jun-2019
 *
 */

public class BostonNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		int originalDigitSum = sumOfDigits(n);

		int factorSum = 0;
		int on = n;

		for (int i = 2; i * i <= on; i++) {

			if (isPrime(i)) {

				while (n % i == 0) {
					factorSum += sumOfDigits(i);
					n = n / i;
				}
			}
		}

		if (n > 1)
			factorSum += sumOfDigits(n);

		if (factorSum == originalDigitSum) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

	public static int sumOfDigits(int n) {

		int ans = 0;

		while (n != 0) {
			int rem = n % 10;
			ans += rem;
			n = n / 10;
		}

		return ans;

	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div * div <= n) {

			if (n % div == 0) {
				return false;
			}
			div++;
		}

		return true;

	}
}
