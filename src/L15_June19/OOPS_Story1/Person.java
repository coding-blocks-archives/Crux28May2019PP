package L15_June19.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Jun-2019
 *
 */

public class Person {

	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception  {

		if (age < 0) {
			throw new Exception("Invalid Age.");
		}

		this.age = age;
	}

	// public void abc(int age) throws Exception {
	// try {
	// setAge(age);
	// } catch (Exception e) {
	// System.out.println("in abc catch");
	// }
	//
	// setAge(age);
	//
	// System.out.println("xyz");
	// }

}
