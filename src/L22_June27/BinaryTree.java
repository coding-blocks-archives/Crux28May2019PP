package L22_June27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 27-Jun-2019
 *
 */

public class BinaryTree {

	Scanner scn = new Scanner(System.in);

	private class Node {

		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BinaryTree() {
		root = construct(null, false);
	}

	private Node construct(Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {

			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int item = scn.nextInt();

		Node nn = new Node();
		nn.data = item;

		System.out.println(nn.data + " has left child ?");
		boolean hlc = scn.nextBoolean();

		if (hlc) {
			nn.left = construct(nn, true);
		}

		System.out.println(nn.data + " has right child ?");
		boolean hrc = scn.nextBoolean();

		if (hrc) {
			nn.right = construct(nn, false);
		}

		return nn;
	}

	public BinaryTree(int[] pre, int[] in) {
		root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}

		Node nn = new Node();
		nn.data = pre[plo];

		// search for pre[plo]
		int si = 0;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}
		}

		int nel = si - ilo;

		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;

	}

	public void display() {
		System.out.println("------------------");
		display(root);
		System.out.println("------------------");
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}

		str += " -> " + node.data + " <- ";

		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {

		if (node == null) {
			return 0;
		}

		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		if (node == null)
			return Integer.MIN_VALUE;

		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));
	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		if (node == null) {
			return -1;

		}
		int lh = ht(node.left);
		int rh = ht(node.right);

		return Math.max(lh, rh) + 1;

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node == null)
			return false;

		if (node.data == item) {
			return true;
		}

		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);

		return lf || rf;

	}

	// Ques : https://leetcode.com/problems/diameter-of-binary-tree/

	public int diameter() {
		return diameter(root);
	}

	private int diameter(Node node) {

		if (node == null)
			return 0;

		int ld = diameter(node.left);
		int rd = diameter(node.right);

		int np = ht(node.left) + ht(node.right) + 2;

		return Math.max(np, Math.max(ld, rd));

	}

	private class DiaPair {
		int diameter = 0;
		int ht = -1;

		@Override
		public String toString() {
			return "Dia: " + diameter + " Ht:" + ht;
		}
	}

	public DiaPair diameter2() {
		return diameter2(root);
	}

	private DiaPair diameter2(Node node) {

		if (node == null) {
			return new DiaPair();
		}

		DiaPair ldp = diameter2(node.left);
		DiaPair rdp = diameter2(node.right);

		DiaPair sdp = new DiaPair();

		int ld = ldp.diameter;
		int rd = rdp.diameter;

		int np = ldp.ht + rdp.ht + 2;

		sdp.diameter = Math.max(np, Math.max(ld, rd));
		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		return sdp;

	}

	public boolean isBalanced() {
		return isBalanced(root);
	}

	private boolean isBalanced(Node node) {

		if (node == null)
			return true;

		boolean lb = isBalanced(node.left);
		boolean rb = isBalanced(node.right);

		int bf = ht(node.left) - ht(node.right);

		if ((bf == -1 || bf == 0 || bf == 1) && lb && rb) {
			return true;
		}

		return false;
	}

	private class BalPair {
		boolean isBal = true;
		int ht = -1;
	}

	public boolean isBalanced2() {
		return isBalanced2(root).isBal;
	}

	private BalPair isBalanced2(Node node) {

		if (node == null)
			return new BalPair();

		BalPair lbp = isBalanced2(node.left);
		BalPair rbp = isBalanced2(node.right);

		BalPair sbp = new BalPair();

		int bf = lbp.ht - rbp.ht;

		if ((bf == -1 || bf == 0 || bf == 1) && lbp.isBal && rbp.isBal) {
			sbp.isBal = true;
		} else {
			sbp.isBal = false;
		}

		sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;

		return sbp;
	}

	// NLR : preorder
	// LNR : inorder
	// LRN : postorder
	// RNL : rev inorder
	// RLN : rev preorder
	// NRL : rev postorder
	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node node) {

		if (node == null)
			return;

		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);

	}

	private class Pair {
		Node node;
		boolean sd;
		boolean ld;
		boolean rd;
	}

	public void preorderI() {

		// create a new stack
		Stack<Pair> stack = new Stack<>();

		// put the root pair
		Pair sp = new Pair();
		sp.node = root;

		stack.push(sp);

		while (!stack.isEmpty()) {

			Pair tp = stack.peek();

			// self
			if (tp.sd == false) {
				tp.sd = true;
				System.out.print(tp.node.data + " ");
			} else if (tp.ld == false) { // left

				Pair np = new Pair();
				np.node = tp.node.left;

				if (np.node != null)
					stack.add(np);

				tp.ld = true;

			} else if (tp.rd == false) { // right

				Pair np = new Pair();
				np.node = tp.node.right;

				if (np.node != null)
					stack.add(np);
				tp.rd = true;

			} else { // remove
				stack.pop();
			}

		}

		System.out.println();
	}

	// Ques :
	// https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/

	private class DepthPair {
		int ht = -1;
		Node temp;

	}

	public Node deepestDepth() {
		return deepestDepth(root).temp;
	}

	private DepthPair deepestDepth(Node node) {

		if (node == null) {
			return new DepthPair();
		}

		DepthPair ldp = deepestDepth(node.left);
		DepthPair rdp = deepestDepth(node.right);

		DepthPair sdp = new DepthPair();

		if (ldp.ht > rdp.ht) {
			sdp.temp = ldp.temp;
		} else if (rdp.ht > ldp.ht) {
			sdp.temp = rdp.temp;
		} else {
			sdp.temp = node;
		}

		sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;

		return sdp;
	}

	// Ques : https://leetcode.com/problems/flip-equivalent-binary-trees/

	public boolean flipEquivalent(BinaryTree other) {
		return flipEquivalent(this.root, other.root);
	}

	private boolean flipEquivalent(Node node1, Node node2) {

		if (node1 == null && node2 == null)
			return true;

		if (node1 == null || node2 == null)
			return false;

		if (node1.data != node2.data) {
			return false;
		}

		boolean r1 = flipEquivalent(node1.left, node2.left);
		boolean r2 = flipEquivalent(node1.right, node2.right);

		boolean r3 = flipEquivalent(node1.left, node2.right);
		boolean r4 = flipEquivalent(node1.right, node2.left);

		return (r1 && r2) || (r3 && r4);

	}

	// Ques : https://leetcode.com/problems/binary-tree-maximum-path-sum/

	public int maxSumPath() {
		int[] ans = new int[1];

		maxSumPath(root, ans);

		return ans[0];
	}

	private int maxSumPath(Node node, int[] ans) {

		if (node == null) {
			return 0;
		}

		int leftBranchSum = Math.max(0, maxSumPath(node.left, ans));
		int rightBranchSum = Math.max(0, maxSumPath(node.right, ans));

		int sp = leftBranchSum + rightBranchSum + node.data;

		if (sp > ans[0]) {
			ans[0] = sp;
		}

		return Math.max(leftBranchSum, rightBranchSum) + node.data;
	}

	// Ques : https://www.geeksforgeeks.org/find-largest-subtree-sum-tree/

	public int largestSubtreeSum() {

		int[] ans = new int[1];
		largestSubtreeSum(root, ans);

		return ans[0];
	}

	private int largestSubtreeSum(Node node, int[] ans) {

		if (node == null) {
			return 0;
		}

		int totalLeftSum = largestSubtreeSum(node.left, ans);
		int totalRightSum = largestSubtreeSum(node.right, ans);

		int sp = totalLeftSum + totalRightSum + node.data;

		if (sp > ans[0]) {
			ans[0] = sp;
		}

		return sp;

	}

	private class BSTPair {

		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		Node largestBSTNode;
		int size = 0;
	}

	public boolean isTreeBST() {
		return isTreeBST(root).isBST;
	}

	private BSTPair isTreeBST(Node node) {

		if (node == null) {
			return new BSTPair();
		}

		BSTPair lp = isTreeBST(node.left);
		BSTPair rp = isTreeBST(node.right);

		BSTPair sp = new BSTPair();

		sp.isBST = lp.isBST && rp.isBST && node.data > lp.max && node.data < rp.min;

		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		return sp;

	}

	public void largestBSTinBT() {
		BSTPair res = largestBSTinBT(root);
		System.out.println(res.largestBSTNode.data);
		System.out.println(res.size);
	}

	private BSTPair largestBSTinBT(Node node) {

		if (node == null)
			return new BSTPair();

		BSTPair lp = largestBSTinBT(node.left);
		BSTPair rp = largestBSTinBT(node.right);

		BSTPair sp = new BSTPair();

		sp.isBST = lp.isBST && rp.isBST && node.data > lp.max && node.data < rp.min;

		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		if (sp.isBST) {
			sp.largestBSTNode = node;
			sp.size = lp.size + rp.size + 1;
		} else {

			if (lp.size > rp.size) {
				sp.largestBSTNode = lp.largestBSTNode;
				sp.size = lp.size;
			} else {
				sp.largestBSTNode = rp.largestBSTNode;
				sp.size = rp.size;
			}

		}

		return sp;

	}

	private class VOPair {
		int data;
		int vl;
		int hl;

		@Override
		public String toString() {
			return this.data + "";
		}
	}

	public void verticalOrder() {

		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();

		verticalOrder(root, 0, 0, map);

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());

		Collections.sort(keys); // [-2,-1,0,1,2]

		for (int key : keys) {
			ArrayList<VOPair> list = map.get(key);

			Collections.sort(list, new VOComparator());
			System.out.println(key + " -> " + list);
		}

		// System.out.println(map);

	}

	private class VOComparator implements Comparator<VOPair> {

		@Override
		public int compare(VOPair o1, VOPair o2) {
			return o1.hl - o2.hl;
		}

	}

	private void verticalOrder(Node node, int vLevel, int hLevel, HashMap<Integer, ArrayList<VOPair>> map) {

		if (node == null) {
			return;
		}

		if (!map.containsKey(vLevel)) {
			map.put(vLevel, new ArrayList<>());
		}

		VOPair np = new VOPair();
		np.data = node.data;
		np.hl = hLevel;
		np.vl = vLevel;
		map.get(vLevel).add(np);

		verticalOrder(node.left, vLevel - 1, hLevel + 1, map);
		verticalOrder(node.right, vLevel + 1, hLevel + 1, map);

	}

}
