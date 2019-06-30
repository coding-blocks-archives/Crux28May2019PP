package L24_June29;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 29-Jun-2019
 *
 */

public class BSTClient {

	public static void main(String[] args) {

		int[] in = { 10, 20, 30, 40, 50, 60, 70 };
		BST bst = new BST(in);

		bst.display();
		// bst.printInRange(15, 65);
		// bst.replaceWithSumLarger();

		bst.add(35);
		bst.add(34);

		// bst.addReturn(90);
		bst.remove(20);
		bst.remove(40);
		bst.remove(60);
		

		bst.display();

	}
}
