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
		bst.replaceWithSumLarger();

		bst.display();
	}
}
