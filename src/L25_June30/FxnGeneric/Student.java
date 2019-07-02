package L25_June30.FxnGeneric;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class Student {

	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {

		return "R:" + this.rollNo + " N:" + this.name;
	}

}
