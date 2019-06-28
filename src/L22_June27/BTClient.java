package L22_June27;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Jun-2019
 *
 */

public class BTClient {

	// 10 true 20 true 40 false false true 50 false false true 30 false true 60
	// false false

	// 10 true 20 true 40 true 50 true 60 false false false false true 70 false true
	// 80 false true 90 false false true 30 false false
	public static void main(String[] args) {

		int[] pre = { 10, 20, 50, 30, 80, 60, 70 };
		int[] in = { 20, 50, 10, 80, 30, 70, 60 };
		
		BinaryTree bt = new BinaryTree(pre, in);
		bt.display();
		
		// System.out.println(bt.max());
		// System.out.println(bt.ht());
		// System.out.println(bt.find(70));
		// System.out.println(bt.size());
		//
		// System.out.println(bt.diameter2());
		// System.out.println(bt.isBalanced());
		// System.out.println(bt.isBalanced2());

		bt.preorder();
		bt.preorderI();
	}
}
