package L15_June19.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 19-Jun-2019
 *
 */

public class Student {

	// data member
	String name = "Q";
	int age = 56;

	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void introduceYourself() {
		System.out.println(this.name + " is " + this.age + " years old.");
	}

	public void sayHi(String name) {
		System.out.println(this.name + " says hi " + name);
	}

}
