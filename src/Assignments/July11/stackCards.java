import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class stackCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int q = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		stackcards(arr, q);

	}

	public static void stackcards(int[] cards, int q) {

		ArrayList<Stack<Integer>> A = new ArrayList<>();
		ArrayList<Stack<Integer>> B = new ArrayList<>();

		for (int i = 0; i < cards.length; i++) {

			A.add(new Stack<>());
			B.add(new Stack<>());
		}

		for (int i = 0; i < cards.length; i++) {

			A.get(0).push(cards[i]);
		}

		// Iterations
		for (int i = 1; i <= q; i++) {

			Stack<Integer> ps = A.get(i - 1);

			while (!ps.isEmpty()) {

				int top = ps.pop();

				if (top % ithPrime(i) == 0) {
					B.get(i).push(top);
				} else {
					A.get(i).push(top);
				}
			}

		}

		for (int i = 0; i < B.size(); i++) {

			Stack<Integer> ps = B.get(i);

			while (!ps.isEmpty()) {
				System.out.println(ps.pop());
			}
		}

		while (!A.get(q).isEmpty()) {

			System.out.println(A.get(q).pop());
		}

	}

	public static int ithPrime(int i) {

		int cnt = 0;
		int num = 2;

		while (true) {

			if (isPrime(num))
				cnt++;

			if (cnt == i)
				return num;

			num++;
		}

	}

	public static boolean isPrime(int n) {

		int mult = 2;

		while (mult * mult <= n) {

			if (n % mult == 0)
				return false;

			mult++;
		}

		return true;

	}

}
