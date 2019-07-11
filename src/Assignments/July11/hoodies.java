import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hoodies {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int q = scn.nextInt();
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();
		Queue<Integer> q3 = new LinkedList<>();
		Queue<Integer> q4 = new LinkedList<>();
		Queue<Integer> group_order = new LinkedList<>();
		boolean isOne = false, isTwo = false, isThree = false, isFour = false;

		for (int k = 0; k < q; k++) {
			String ch;
			ch = scn.next();
			if (ch.charAt(0) == 'E') {

				int x = scn.nextInt();
				int y = scn.nextInt();
				if (x == 1) {
					q1.add(y);

					if (!isOne) {
						group_order.add(1);
						isOne = true;
					}

				} else if (x == 2) {
					q2.add(y);

					if (!isTwo) {
						group_order.add(2);
						isTwo = true;
					}

				} else if (x == 3) {
					q3.add(y);

					if (!isThree) {
						group_order.add(3);
						isThree = true;
					}

				} else {
					q4.add(y);

					if (!isFour) {
						group_order.add(4);
						isFour = true;
					}
				}

			} else {
				int front = group_order.peek();
				if (front == 1) {

					if (!q1.isEmpty()) {
						System.out.println(1 + " " + q1.peek());
						q1.remove();
					}

					if (q1.isEmpty()) {
						group_order.remove();
						isOne = false;
					}

				} else if (front == 2) {

					if (!q2.isEmpty()) {
						System.out.println(2 + " " + q2.peek());
						q2.remove();
					}

					if (q2.isEmpty()) {
						group_order.remove();
						isTwo = false;
					}

				} else if (front == 3) {

					if (!q3.isEmpty()) {
						System.out.println(3 + " " + q3.peek());
						q3.remove();

					}
					if (q3.isEmpty()) {
						group_order.remove();
						isThree = false;
					}

				} else {

					if (!q4.isEmpty()) {
						System.out.println(4 + " " + q4.peek());
						q4.remove();
					}

					if (q4.isEmpty()) {
						group_order.remove();
						isFour = false;

					}

				}
			}
		}

	}

}
