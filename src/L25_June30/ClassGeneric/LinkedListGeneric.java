package L25_June30.ClassGeneric;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class LinkedListGeneric<T> {

	private class Node {
		T data;
		Node next;

		public Node() {

		}

		public Node(T data) {
			this.data = data;
		}
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

	// O(1)
	public T getFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return head.data;
	}

	// O(1)
	public T getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return tail.data;
	}

	// O(n)
	public T getAt(int k) throws Exception {

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

	// O(n)
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

	// O(1)
	public void addLast(T item) {

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

	// O(1)
	public void addFirst(T item) {

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

	// O(n)
	public void addAt(int k, T item) throws Exception {

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

	// O(1)
	public T removeFirst() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		T rv = head.data;

		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.next;
			size--;
		}

		return rv;

	}

	// O(n)
	public T removeLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		T rv = tail.data;

		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {

			Node nm2 = getNodeAt(size - 2);
			nm2.next = null;
			tail = nm2;

			size--;
		}

		return rv;

	}

	// O(n)
	public T removeAt(int k) throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (k < 0 || k >= size) {
			throw new Exception("Invalid Index.");
		}

		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removeLast();
		} else {

			Node nm1 = getNodeAt(k - 1);
			Node n = getNodeAt(k);
			Node np1 = getNodeAt(k + 1);

			// link
			nm1.next = np1;

			// size
			size--;

			// return
			return n.data;

		}

	}

}
