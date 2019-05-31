package L3_May31;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-May-2019
 *
 */

public class Rotate {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int rot = scn.nextInt();

		int nod = 0;

		int temp = n ;
		
		// count no. of digits
		while (temp != 0) {
			nod = nod + 1;
			temp = temp / 10;
		}

		rot = rot % nod ;
		
		if(rot < 0) {
			rot = rot + nod ;
		}
		
		// rotation
		int divisor = (int) Math.pow(10, nod - rot);
		int multiplier = (int) Math.pow(10, rot);

		int rem = n % divisor;
		int quo = n / divisor;

		int ans = rem * multiplier + quo;

		System.out.println(ans);

	}
}






