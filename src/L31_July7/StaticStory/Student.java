package L31_July7.StaticStory;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 07-Jul-2019
 *
 */

public class Student {

	String name;
	int age;
	final int rollNo = 20;
	static int numberOfStudents;

	public Student() {
		numberOfStudents++;
		// this.rollNo = numberOfStudents;
	}

	// non static fxn static field ? YES
	// non static fxn non static field ? YES
	public final int getRollNo() {
		// this.rollNo = 10 ;
		return this.rollNo;
	}

	// static fxn non static field access ? NO
	// static fxn static field access ? YES
	// static fxn this ? NO
	public static int getNos() {
		return numberOfStudents;
	}
}
