import java.util.*;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BST() {
		this.root = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			} else if (data < node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			} else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}

	public void kFar(int k, int dst) {

		kFar(this.root, k, dst);
	}

	private int kFar(Node node, int k, int dst) {

		if (node == null) {
			return -1;
		}

		if (node.data == dst) {
			kDown(node, 0, k);
			return 0;
		}

		int ld = kFar(node.left, k, dst);

		if (ld != -1) {

			if (ld + 1 == k) {
				System.out.println(node.data);
			}

			kDown(node.right, 0, k - ld - 2);

			return ld + 1;
		}

		int rd = kFar(node.right, k, dst);

		if (rd != -1) {

			if (rd + 1 == k) {
				System.out.println(node.data);
			}

			kDown(node.left, 0, k - rd - 2);

			return rd + 1;
		}

		return -1;

	}

	private void kDown(Node node, int count, int k) {

		if (node == null) {
			return;
		}

		if (count == k) {
			System.out.println(node.data);
			return;
		}

		kDown(node.left, count + 1, k);
		kDown(node.right, count + 1, k);
	}

	public static void main(String[] args) {
		BST bst = new BST();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			bst.add(s.nextInt());
		}
		int tar = s.nextInt();
		int k = s.nextInt();
		bst.kFar(k, tar	);

	}
}
