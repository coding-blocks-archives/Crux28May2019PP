import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 28-May-2019
 *
 */

public class Prime {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int fact = 0;

		int n = scn.nextInt();

		int div = 1;
		while (div <= n) {

			if (n % div == 0) {
				fact = fact + 1;
			}

			div = div + 1;
		}

		if (fact == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}
}
