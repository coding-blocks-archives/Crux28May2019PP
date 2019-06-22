package L17_June21;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Jun-2019
 *
 */

public class DQClient {

	public static void main(String[] args) throws Exception {

		DynamicQueue dq = new DynamicQueue();

		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);

		dq.dequeue();
		dq.dequeue();

		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);

		dq.display();
		// displayReverse(dq, 0);
		actualReverse(dq);
		dq.display();

		int[] arr = { 2, 3, 5, 6, -2, -9, -4, 10, 15 };
		firstNegativeInteger(arr, 4);

	}

	public static void displayReverse(DynamicQueue q, int c) throws Exception {

		if (c == q.size()) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		displayReverse(q, c + 1);
		System.out.println(temp);

	}

	public static void actualReverse(DynamicQueue q) throws Exception {

		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		actualReverse(q);
		q.enqueue(temp);

	}

	public static void firstNegativeInteger(int[] arr, int k) throws Exception {

		DynamicQueue q = new DynamicQueue();

		for (int i = 0; i <= k - 1; i++) {
			if (arr[i] < 0)
				q.enqueue(i);
		}

		for (int i = 1; i <= arr.length - k; i++) {

			// first negative print
			if (q.isEmpty()) {
				System.out.println(0);
			} else {
				System.out.println(arr[q.getFront()]);
			}

			// queue update , by removing values which are out of this window
			if (!q.isEmpty() && q.getFront() < i) {
				q.dequeue();
			}

			// present element
			if (arr[i + k - 1] < 0) {
				q.enqueue(i + k - 1);
			}

		}

		// first negative of last window
		if (q.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(arr[q.getFront()]);
		}

	}

}
