package L3_May31;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 31-May-2019
 *
 */

public class DataTypeDemo {

	public static void main(String[] args) {

		byte by = 10;
		short sh = 10;
		int in = 10;
		long lo = 10;

		// case 1
		by = (byte) sh;
		// by = in ;
		// by = lo ;

		sh = by;
		// sh = in ;
		// sh = lo ;

		in = sh;
		in = by;
		// in = lo ;

		lo = by;
		lo = sh;
		lo = in;

		// case 2
		by = 10;
		by = (byte) 128;
		System.out.println(by);
		by = (byte) 130;
		System.out.println(by);

		// case 3
		in = (int) 10000000000L;
		System.out.println(in);

		// case 4
		float fl = 4.5f;
		double db = 6.7;
		// fl = db ;
		db = fl;

		// case 5
		in = 10;
		// in = (int) fl ;
		System.out.println(in);
		fl = in;
		System.out.println(fl);

		// case 6
		boolean bl = true;

		if (in > 0) {

		}

		if (bl == true) {

		}

		if (bl) {

		}

		// case 7
		by = 0;
		while (by <= 126) {
			System.out.println(by);
			by = (byte) (by + 1);
		}

		in = 100;

		char ch = 'a';
		System.out.println(ch);

		in = ch;
		System.out.println(in);

		ch = (char) (ch + 2);

		System.out.println(ch);

		// case 8
		System.out.println(10 + 20 + "Hello" + 10 + 20);
		System.out.println(2 + ' ' + 5);
		System.out.println(2 + " " + 5);
		System.out.println("Hello" + '\t' + "World");
		System.out.println("Hello" + "\t" + "World");
		System.out.println(2 + '\t');

	}
}






