package L16_June20;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 20-Jun-2019
 *
 */

public class Queue {

	protected int[] data;
	protected int size;
	protected int front;

	public Queue() {
		data = new int[5];
		size = 0;
		front = 0;
	}

	public Queue(int cap) {
		data = new int[cap];
		size = 0;
		front = 0;
	}

	public void enqueue(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Full.");
		}

		int idx = (front + size) % data.length;
		data[idx] = item;

		size++;
	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int rv = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int rv = data[front];
		return rv;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public void display() {

		for (int i = 0; i < size; i++) {
			int idx = (i + front) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();

	}

}
