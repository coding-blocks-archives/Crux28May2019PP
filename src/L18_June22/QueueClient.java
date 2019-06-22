package L18_June22;

import L17_June21.DynamicQueue;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class QueueClient {

	public static void main(String[] args) throws Exception {

		QueueUsingStackDeqEff dq = new QueueUsingStackDeqEff();

		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);

		dq.dequeue();
		dq.dequeue();
		dq.dequeue();
		dq.dequeue();
		dq.dequeue();
		dq.dequeue();

		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);

		dq.display();

	}
}
