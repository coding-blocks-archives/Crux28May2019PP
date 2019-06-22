package L18_June22;

import L17_June21.DynamicStack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class QueueUsingStackDeqEff {

	DynamicStack s = new DynamicStack();

	public void enqueue(int item) throws Exception {

		try {
			DynamicStack helper = new DynamicStack();

			while (!s.isEmpty()) {
				helper.push(s.pop());
			}

			s.push(item);

			while (!helper.isEmpty()) {
				s.push(helper.pop());
			}

		} catch (Exception e) {
			throw new Exception("Queue is Full.");
		}
	}

	public int dequeue() throws Exception {

		try {
			return s.pop();
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	public int getFront() throws Exception {

		try {
			return s.peek();
		} catch (Exception e) {
			throw new Exception("Queue is Empty");
		}
	}

	public int size() {

		return s.size();
	}

	public boolean isEmpty() {
		return s.isEmpty();
	}

	public boolean isFull() {
		return s.isFull();
	}

	public void display() {

		s.display();

	}
}
