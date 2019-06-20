package L15_June19.OOPS_Story1;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Jun-2019
 *
 */

public class PClient {

	public static void main(String[] args) {

		System.out.println("hii");

		Person p = new Person();

		try {
			p.setAge(10);
			return ;
		} catch (Exception e) {
			System.out.println("in catch");
		}finally {
			System.out.println("in finally");
		}

		System.out.println(p.getAge());

		System.out.println("bye");

	}
}







