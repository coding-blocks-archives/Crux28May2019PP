package L22_June27;

import java.util.LinkedList;
import java.util.List;

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

		// int[] pre = { 1, 2, 4, 5, 7, 8, 3, 6 };
		// int[] in = { 4, 2, 7, 5, 8, 1, 6, 3 };

		// int[] pre = { -10, 9, 20, 15, 7, 8, 9 };
		// int[] in = { 9, -10, 15, 20, 8, 7, 9 };

		// int[] pre = { 2, 5, 7, 6, 8, 10 };
		// int[] in = { 2, 7, 5, 8, 6, 10 };

		// int[] in = { 5, 10, 15, 200, 22, 25, 26 };
		// int[] pre = { 200, 10, 5, 15, 25, 22, 26 };

		// int[] in = { 50, 10, 125, 150, 170, 180, 200, 250, 30, 350, 370 };
		// int[] pre = { 200, 10, 50, 150, 125, 170, 180, 30, 250, 350, 370 };

		int[] in = { 40, 110, 80, 90, 20, 50, 130, 10, 60, 30, 70 };
		int[] pre = { 10, 20, 40, 80, 110, 90, 50, 130, 30, 60, 70 };
		BinaryTree bt = new BinaryTree(pre, in);
		bt.display();

		int[] pre1 = { 1, 3, 6, 2, 4, 5, 8, 7 };
		int[] in1 = { 3, 6, 1, 4, 2, 8, 5, 7 };

		// BinaryTree bt1 = new BinaryTree(pre1, in1);
		// bt1.display();

		// System.out.println(bt.max());
		// System.out.println(bt.ht());
		// System.out.println(bt.find(70));
		// System.out.println(bt.size());
		//
		// System.out.println(bt.diameter2());
		// System.out.println(bt.isBalanced());
		// System.out.println(bt.isBalanced2());

		// bt.preorder();
		// bt.preorderI();

		// System.out.println(bt.flipEquivalent(bt1));

		// System.out.println(bt.maxSumPath());
		// System.out.println(bt.largestSubtreeSum());

		// System.out.println(bt.isTreeBST());
		//

//		bt.largestBSTinBT();
		
		bt.verticalOrder();
		
		List<Integer> list = fun() ;
	}
	
	public static LinkedList<Integer> fun() {
		
		LinkedList<Integer> list = new LinkedList<>() ;
		
		list.add(10) ;
		
		return list ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
