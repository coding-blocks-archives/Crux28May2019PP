import java.util.*;
public class LCA {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		LCA m = new LCA();
		BinaryTree bt = m.new BinaryTree();

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		System.out.println(bt.LCA(n1, n2));
//			bt.display();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

		class Pair {

			int data;
			boolean f;
		}

		public int LCA(int n1, int n2) {
			return this.LCA(this.root, n1, n2).data;
		}

		private Pair LCA(Node root, int n1, int n2) {

			// write your code here
			if (root == null)
				return new Pair();

			if (root.data == n1 || root.data == n2) {
				Pair bp = new Pair();
				bp.data = root.data;
				bp.f = true;
				return bp;
			}

			Pair l_pair = LCA(root.left, n1, n2);
			Pair r_pair = LCA(root.right, n1, n2);

			Pair sp = new Pair();
			if (l_pair.f && r_pair.f) {
				sp.data = root.data;
			} else {
				sp.data = (l_pair.f ? l_pair.data : r_pair.data);
			}

			sp.f = l_pair.f || r_pair.f;
			return sp;

		}

	}

}

}
