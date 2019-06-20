package L16_June20.OOPS_Story2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Jun-2019
 *
 */

public class Car {

	int s;
	int p;
	String c;

	public Car(int s, int p, String c) {
		this.s = s;
		this.p = p;
		this.c = c;
	}

	@Override
	public String toString() {
		return "S:" + s + " P:" + p + " C:" + c;
	}
}
