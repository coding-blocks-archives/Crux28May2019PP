import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class strongestFighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static void StrongestFighter(int arr[], int n, int k) {

		LinkedList<Integer> Qi = new LinkedList<>();

		/* Process first k (or first window) elements of array */
		int i;
		for (i = 0; i < k; ++i) {

			while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast(); // Remove from rear

			Qi.addLast(i);
		}

		// Process rest of the elements, i.e., from arr[k] to arr[n-1]
		for (; i < n; ++i) {

			System.out.print(arr[Qi.peek()] + " ");

			while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
				Qi.removeFirst();

			while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();

			// Add current element at the rear of Queue
			Qi.addLast(i);
		}

		// Print the maximum element of last window
		System.out.print(arr[Qi.peek()]);
	}

}
