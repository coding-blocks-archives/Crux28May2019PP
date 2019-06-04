package L6_June4;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jun-2019
 *
 */

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		// size
		System.out.println(list.size());

		// add
		list.add(10);
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		list.add(30);
		System.out.println(list);

		System.out.println(list.size());

		// get, constant
		System.out.println(list.get(1));
		// System.out.println(list.get(3));

		// set, update , constant
		list.set(0, 100);
		System.out.println(list);

		// add at index : n
		list.add(1, 40);
		System.out.println(list);

		// remove
		list.remove(0);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int val : list) {
			System.out.println(val);
		}

	}
}
