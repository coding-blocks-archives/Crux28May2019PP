package L20_June25;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Jun-2019
 *
 */

public class GTClient {

	// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
	// 10 3 20 2 50 0 60 2 110 0 120 2 180 0 190 0 30 1 70 0 40 3 80 3 130 0 140 3
	// 200 0 210 0 220 0 150 0 90 0 100 2 160 0 170 0
	public static void main(String[] args) {
		GenericTree gt = new GenericTree();
		gt.display();

		System.out.println(gt.size());
		System.out.println(gt.ht());
		System.out.println(gt.max());
		System.out.println(gt.find(70));

		// gt.linearize();

		gt.display();

		// gt.postorder();
		System.out.println();

		// gt.levelOrder();
		// gt.levelOrderLW2();
		gt.levelOrderZigZag();

	}
}
