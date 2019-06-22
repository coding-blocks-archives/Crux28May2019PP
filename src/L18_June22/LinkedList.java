package L18_June22;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int getFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return head.data;
	}

	public int getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return tail.data;
	}

	public int getAt(int k) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (k < 0 || k >= size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	private Node getNodeAt(int k) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (k < 0 || k >= size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void display() {

		System.out.println("--------------------");
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();
		System.out.println("--------------------");
	}

	public void addLast(int item) {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (!isEmpty())
			tail.next = nn;

		// data members
		if (isEmpty()) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail = nn;
			size++;
		}

	}

	public void addFirst(int item) {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		nn.next = head;

		// data members
		if (isEmpty()) {
			head = nn;
			tail = nn;
			size++;
		} else {
			head = nn;
			size++;
		}

	}

	public void addAt(int k, int item) throws Exception {

		if (k < 0 || k > size()) {
			throw new Exception("Invalid Index.");
		}

		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addLast(item);
		} else {

			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// access previous and front
			Node nm1 = getNodeAt(k - 1);
			Node np1 = nm1.next;

			// link
			nm1.next = nn;
			nn.next = np1;

			// data members
			size++;

		}

	}

}
