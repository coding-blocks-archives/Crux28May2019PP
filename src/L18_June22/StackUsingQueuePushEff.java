package L18_June22;

import L17_June21.DynamicQueue;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class StackUsingQueuePushEff {

	DynamicQueue q = new DynamicQueue();

	public void push(int item) throws Exception {

		try {
			q.enqueue(item);
		} catch (Exception e) {
			throw new Exception("Stack is Full.");
		}
	}

	public int pop() throws Exception {

		try {
			DynamicQueue helper = new DynamicQueue();

			while (q.size() != 1) {
				helper.enqueue(q.dequeue());
			}

			int rv = q.dequeue();
			q = helper;
			return rv;

		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public int peek() throws Exception {

		try {
			DynamicQueue helper = new DynamicQueue();

			while (q.size() != 1) {
				helper.enqueue(q.dequeue());
			}

			int rv = q.dequeue();
			helper.enqueue(rv);
			q = helper;
			return rv;

		} catch (Exception e) {
			throw new Exception("Stack is Empty.");
		}

	}

	public int size() {
		return q.size();
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}

	public boolean isFull() {
		return q.isFull();
	}

	public void display() throws Exception {
		display(0) ;
	}
	
	private void display(int c) throws Exception {
		if (c == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		display(c + 1);
		System.out.println(temp);

	}

}
