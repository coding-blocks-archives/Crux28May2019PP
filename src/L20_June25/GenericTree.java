package L20_June25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 25-Jun-2019
 *
 */

public class GenericTree {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		root = takeInput(null, -1);
	}

	private Node takeInput(Node parent, int ith) {

		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			System.out.println("Enter the data for " + ith + " child of " + parent.data);
		}

		int item = scn.nextInt();

		// create a new node
		Node nn = new Node();
		nn.data = item;

		System.out.println("No. of children for " + nn.data);
		int noc = scn.nextInt();

		for (int i = 0; i < noc; i++) {

			Node child = takeInput(nn, i);
			nn.children.add(child);

		}

		return nn;
	}

	public void display() {
		System.out.println("------------------");
		display(root);
		System.out.println("------------------");
	}

	private void display(Node node) {

		String str = node.data + "->";

		for (Node child : node.children) {
			str += child.data + ", ";
		}

		str += ".";
		System.out.println(str);

		for (Node child : node.children) {
			display(child);
		}

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {

		int ts = 0;

		for (Node child : node.children) {

			int cs = size(child);
			ts += cs;

		}

		return ts + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {

		int tm = node.data;

		for (Node child : node.children) {

			int cm = max(child);

			if (cm > tm) {
				tm = cm;
			}
		}

		return tm;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {

		int th = -1;

		for (Node child : node.children) {

			int ch = ht(child);

			if (ch > th) {
				th = ch;
			}

		}

		return th + 1;

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node node, int item) {

		if (node.data == item)
			return true;

		for (Node child : node.children) {
			boolean cf = find(child, item);

			if (cf)
				return true;
		}

		return false;

	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {

		// smaller problem
		for (Node child : node.children) {
			mirror(child);
		}

		// reverse : self work
		int i = 0;
		int j = node.children.size() - 1;

		while (i < j) {

			Node in = node.children.get(i);
			Node jn = node.children.get(j);

			node.children.set(i, jn);
			node.children.set(j, in);

			i++;
			j--;
		}

	}

	public void linearize() {
		linearize(root);
	}

	private void linearize(Node node) {

		for (Node child : node.children) {
			linearize(child);
		}

		while (node.children.size() > 1) {
			Node firstIndexNode = node.children.remove(1);
			Node tail = getTail(node.children.get(0));

			tail.children.add(firstIndexNode);

		}

	}

	private Node getTail(Node node) {

		if (node.children.size() == 0) {
			return node;
		}

		return getTail(node.children.get(0));
	}

	public void display2(Node node) {

		System.out.println("Hii " + node.data);

		for (Node child : node.children) {
			System.out.println("Going towards " + child.data);
			display2(child);
			System.out.println("Coming Back from " + child.data);

		}

		System.out.println("Bye " + node.data);

	}

	public void preorder() {
		preorder(root);
	}

	private void preorder(Node node) {

		System.out.println(node.data);

		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}

		System.out.println(node.data);

	}

	public void levelOrder() {

		LinkedList<Node> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				queue.addLast(child);
			}

		}

		System.out.println();

	}

	public void printAtLevel(int level) {
		printAtLevel(root, level, 0);
	}

	private void printAtLevel(Node node, int level, int count) {

		if (count == level) {
			System.out.println(node.data);
			return;
		}

		for (Node child : node.children) {
			printAtLevel(child, level, count + 1);
		}

	}

	public void levelOrderLW() {

		LinkedList<Node> queue = new LinkedList<>();

		queue.addLast(root);
		queue.addLast(null);

		while (!queue.isEmpty()) {

			Node rn = queue.removeFirst();

			if (rn == null) {
				System.out.println();

				if (queue.isEmpty())
					break;

				queue.addLast(null);
				continue;
			}

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				queue.addLast(child);
			}

		}

		System.out.println();

	}

	public void levelOrderLW2() {

		LinkedList<Node> primary = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		primary.addLast(root);

		while (!primary.isEmpty()) {

			Node rn = primary.removeFirst();

			System.out.print(rn.data + " ");

			for (Node child : rn.children) {
				helper.addLast(child);
			}

			if (primary.isEmpty()) {
				System.out.println();
				primary = helper;
				helper = new LinkedList<>();
			}

		}

	}

	public void levelOrderZigZag() {

		LinkedList<Node> primaryS = new LinkedList<>();
		LinkedList<Node> helperS = new LinkedList<>();

		int count = 0;

		primaryS.addFirst(root);

		while (!primaryS.isEmpty()) {

			Node rn = primaryS.removeFirst();

			System.out.print(rn.data + " ");

			if (count % 2 == 0) {

				for (Node child : rn.children) {
					helperS.addFirst(child);
				}

			} else {

				for (int i = rn.children.size() - 1; i >= 0; i--) {
					helperS.addFirst(rn.children.get(i));
				}

			}

			if (primaryS.isEmpty()) {

				System.out.println();
				count++;
				primaryS = helperS;
				helperS = new LinkedList<>();
			}

		}

	}

}




