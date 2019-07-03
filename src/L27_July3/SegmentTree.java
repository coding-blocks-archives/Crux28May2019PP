package L27_July3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Jul-2019
 *
 */

public class SegmentTree {

	private class Node {

		int data;
		int si;
		int ei;
		Node left;
		Node right;

		@Override
		public String toString() {
			return data + "";
		}
	}

	private Node root;
	private STreeI sti;

	public SegmentTree(int[] arr, STreeI sti) {
		this.sti = sti;
		root = construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int lo, int hi) {

		if (lo == hi) {
			Node bn = new Node();
			bn.si = lo;
			bn.ei = hi;
			bn.data = arr[lo];
			return bn;
		}

		int mid = (lo + hi) / 2;

		Node nn = new Node();
		nn.si = lo;
		nn.ei = hi;

		nn.left = construct(arr, lo, mid);
		nn.right = construct(arr, mid + 1, hi);

		nn.data = sti.type(nn.left.data, nn.right.data);

		return nn;

	}

	public void display() {
		System.out.println("----------------");
		display(root);
		System.out.println("----------------");
	}

	private void display(Node node) {

		if (node == null) {
			return;
		}

		String str = "";

		if (node.left == null) {
			str += ".";
		} else {
			str += node.left;
		}

		str += " -> " + node + " <- ";

		if (node.right == null) {
			str += ".";
		} else {
			str += node.right;
		}

		System.out.println(str);

		display(node.left);
		display(node.right);

	}

	public int query(int qsi, int qei) {

		return query(root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {

		if (node.si >= qsi && node.ei <= qei) { // full contribution
			return node.data;
		} else if (node.ei < qsi || node.si > qei) { // no contribution
			return sti.defaultValue();
		} else {

			int lq = query(node.left, qsi, qei);
			int rq = query(node.right, qsi, qei);

			return sti.type(lq, rq);

		}

	}

	public void update(int idx, int item) {
		update(root, idx, item);
	}

	private void update(Node node, int idx, int item) {

		if (idx == node.si && idx == node.ei) {
			node.data = item;
		} else if (idx >= node.si && idx <= node.ei) {
			update(node.left, idx, item);
			update(node.right, idx, item);

			node.data = sti.type(node.left.data, node.right.data);
		} else {

			// do nothing simply return
		}

	}

}
