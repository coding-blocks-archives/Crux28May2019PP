package L25_June30.ClassGeneric;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class GenericClassDemo {

	public static void main(String[] args) {

		Pair<Pair<String, Integer>, Pair<Double, Character>> p = new Pair<>();

		p.a = new Pair<>();
		p.b = new Pair<>();

		p.a.a = "hello";
		System.out.println(p.a.a);
		System.out.println(p.a.b);
		System.out.println(p.b.a);
		System.out.println(p.b.b);

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		System.out.println(list.size());
		list.add(new ArrayList<>());
		list.get(0).add(10);
		list.get(0).add(20);
		list.add(new ArrayList<>());
		list.get(1).add(30);
		list.get(1).add(40);
		list.add(new ArrayList<>());
		list.get(2).add(50);
		list.get(2).add(60);
		System.out.println(list.get(0));
		System.out.println(list);

		LinkedListGeneric<ArrayList<Integer>> ll = new LinkedListGeneric<>();

		ll.addLast(list.get(0));
		ll.addLast(list.get(1));
		ll.addLast(list.get(2));
		ll.display();

	}
}
