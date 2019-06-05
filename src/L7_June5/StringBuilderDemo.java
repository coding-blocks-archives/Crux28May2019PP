package L7_June5;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 05-Jun-2019
 *
 */

public class StringBuilderDemo {

	public static void main(String[] args) {

		// string -> sb
		String str = "hellobye";
		StringBuilder sb = new StringBuilder(str);

		// length
		System.out.println(sb.length());

		// char At
		System.out.println(sb.charAt(1));
		System.out.println(sb.charAt(sb.length() - 1));

		// add
		sb.insert(2, "bye");
		System.out.println(sb);
		sb.insert(sb.length(), 'i');
		System.out.println(sb);

		sb.append("abc");
		System.out.println(sb);

		// delete
		sb.deleteCharAt(3);
		System.out.println(sb);

		sb.delete(2, 4);
		System.out.println(sb);

		// update
		sb.setCharAt(3, 'p');
		System.out.println(sb);

		// sb -> string
		String str1 = sb.toString();
		System.out.println(str1);

	}

	public static String fun() {

	}

}
