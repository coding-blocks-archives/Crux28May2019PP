package L22_June27;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Jun-2019
 *
 */

public class BTClient {

	// 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.ht());
		System.out.println(bt.find(70));
		System.out.println(bt.size());
	}
}
