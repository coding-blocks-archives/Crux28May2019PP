package L28_July4;

import java.util.ArrayList;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jul-2019
 *
 */

public class HeapClient {

	public static void main(String[] args) {

		Heap heap = new Heap();

		for (int i = 1; i <= 9; i++) {
			heap.add(i * 10);
		}

		heap.display();
		heap.add(15);
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();
		System.out.println(heap.remove());
		heap.display();

	}

}
