package L18_June22;

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

		public Node() {
			// TODO Auto-generated constructor stub
		}

		public Node(int data) {
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
	public int getFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return head.data;
	}

	// O(1)
	public int getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return tail.data;
	}

	// O(n)
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

	// O(1)
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

	// O(n)
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

	// O(1)
	public int removeFirst() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		int rv = head.data;

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
	public int removeLast() throws Exception {

		if (size == 0) {
			throw new Exception("LL is Empty.");
		}

		int rv = tail.data;

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
	public int removeAt(int k) throws Exception {

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

	public void reverseDI() throws Exception {

		int left = 0;
		int right = size - 1;

		while (left < right) {

			Node ln = getNodeAt(left);
			Node rn = getNodeAt(right);

			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;

			left++;
			right--;
		}
	}

	public void reversePI() {

		Node prev = head;
		Node curr = prev.next;

		while (curr != null) {

			Node ahead = curr.next;

			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		Node temp = head;
		head = tail;
		tail = temp;

		tail.next = null;

	}

	public void reversePR() {
		reversePR(head, head.next);

		Node temp = head;
		head = tail;
		tail = temp;

		tail.next = null;

	}

	private void reversePR(Node prev, Node curr) {

		if (curr == null)
			return;

		// Node ahead = curr.next ;
		// curr.next = prev;
		//
		// reversePR(curr, ahead);

		reversePR(curr, curr.next);
		curr.next = prev;

	}

	public void reverseDR() {
		reverseDR(head, head, 0);
	}

	private Node reverseDR(Node left, Node right, int c) {

		if (right == null)
			return left;

		Node cl = reverseDR(left, right.next, c + 1);

		if (c >= size / 2) {
			// swap
			int temp = cl.data;
			cl.data = right.data;
			right.data = temp;

		}

		return cl.next;

	}

	public void fold() {
		fold(head, head, 0);
	}

	private Node fold(Node left, Node right, int c) {

		if (right == null) {
			return left;
		}

		Node cl = fold(left, right.next, c + 1);

		Node ahead = null;

		if (c > size / 2) {

			ahead = cl.next;
			cl.next = right;
			right.next = ahead;

		}

		if (c == size / 2) {
			tail = right;
			tail.next = null;
		}

		return ahead;
	}

	private class HeapMover {
		Node left;
	}

	public void reverseDRHM() {
		HeapMover mover = new HeapMover();
		mover.left = head;

		reverseDRHM(mover, head, 0);
	}

	private void reverseDRHM(HeapMover mover, Node right, int c) {

		if (right == null)
			return;

		reverseDRHM(mover, right.next, c + 1);

		if (c >= size / 2) {
			// swap
			int temp = mover.left.data;
			mover.left.data = right.data;
			right.data = temp;

		}

		mover.left = mover.left.next;

	}

	public int midNode() {

		Node slow = head;
		Node fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	public int kthFromLast(int k) {

		Node fast = head;
		Node slow = head;

		for (int i = 1; i <= k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;

	}

	public int intersection() {

		// create a dummy ll
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n7.next = n8;
		n8.next = n4;

		// main logic
		Node a = n1; // a head
		Node b = n7; // b head

		while (a != b) {

			a = (a == null ? n7 : a.next);
			b = (b == null ? n1 : b.next);

		}

		return a.data;

	}

	public void createDummyListLoop() {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);
		Node n9 = new Node(90);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n4;

		this.head = n1;
	}

	public boolean detectRemoveLoop() {

		// detect loop
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				break;
		}

		if (slow == fast) {

			// loop remove
			Node start = head;
			Node loop = slow;

			while (start.next != loop.next) {
				start = start.next;
				loop = loop.next;
			}

			loop.next = null;

			return true;

		} else {

			// loop doesnot exist
			return false;
		}

	}

	public void removeDuplicates() {

		Node fakeHead = new Node();
		fakeHead.next = head;

		Node prev = fakeHead;
		Node curr = head;

		while (curr != null) {

			while (curr.next != null && curr.data == curr.next.data) {
				curr = curr.next;
			}

			if (prev.next == curr) {
				prev = curr;
			} else {
				prev.next = curr.next;
			}

			curr = curr.next;
		}

		head = fakeHead.next;

	}

	public void kReverse(int k) throws Exception {

		LinkedList prev = null;

		while (size != 0) {

			LinkedList curr = new LinkedList();

			for (int i = 1; i <= k && size != 0; i++) {
				curr.addFirst(removeFirst());
			}

			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}

		}

		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
		// prev.display();

	}

}
