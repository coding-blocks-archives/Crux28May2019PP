package L17_June21;

import java.util.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Jun-2019
 *
 */

public class DSClient {

	public static void main(String[] args) throws Exception {

		DynamicStack ds = new DynamicStack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.push(60);

		// ds.display();
		// displayReverse(ds);
		// System.out.println();
		// ds.display();
		//
		// actualReverse(ds);
		// ds.display();
		//
		int[] arr = { 2, 8, 3, 21, 10, 13 };
//		nextGreaterElement(arr);
		int[] ans = nextGreaterElement2(arr);

		System.out.println("NG Result :");
		for (int val : ans)
			System.out.print(val + " ");
		System.out.println();
		
		int[] prices = { 100, 20, 30, 90, 60, 50, 70, 80, 120, 110, 50 };
		int[] res = stockSpan(prices);

		System.out.println("Stock Span Result :");
		for (int val : res) {
			System.out.print(val + " ");
		}
		System.out.println();

	}

	public static void displayReverse(DynamicStack s) throws Exception {

		if (s.isEmpty())
			return;

		int temp = s.pop();
		displayReverse(s);
		System.out.print(temp + " ");
		s.push(temp);

	}

	public static void actualReverse(DynamicStack s, DynamicStack h) throws Exception {

		if (s.isEmpty()) {

			if (h.isEmpty()) {
				return;
			}

			int val = h.pop();
			actualReverse(s, h);
			s.push(val);

			return;
		}

		int temp = s.pop();
		h.push(temp);

		actualReverse(s, h);

	}

	public static void nextGreaterElement(int[] arr) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > stack.peek()) {
				System.out.println(stack.pop() + " -> " + arr[i]);
			}

			stack.push(arr[i]);

		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + "-> -1");
		}

	}

	public static int[] nextGreaterElement2(int[] arr) {

		int[] ans = new int[arr.length];

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				ans[stack.pop()] = arr[i];
			}

			stack.push(i);

		}

		while (!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}

		return ans;

	}

	public static int[] stockSpan(int[] prices) {

		Stack<Integer> stack = new Stack<>();

		int[] ans = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {

			while (!stack.isEmpty() && prices[i] > prices[stack.peek()]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.peek();
			}

			stack.push(i);
		}

		return ans;

	}
}
