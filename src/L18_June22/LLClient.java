package L18_June22;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class LLClient {

	public static void main(String[] args) throws Exception {

		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(12);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		list.addLast(90);
		list.addLast(100);

		list.display();

		// list.addAt(2, 60);
		// list.display();

		// System.out.println(list.getAt(3));

		// System.out.println(list.getFirst());

		// System.out.println(list.removeFirst());
		list.display();

		// list.removeAt(3) ;
		list.display();

		// list.reverseDR();
		list.display();
		// list.fold();
		list.display();

		// System.out.println(list.intersection());

		// list.createDummyListLoop();
		// list.display();
		// list.detectRemoveLoop();
		list.display();

		// list.removeDuplicates();
		list.display();

		list.kReverse(3);
		list.display();
	}
}
