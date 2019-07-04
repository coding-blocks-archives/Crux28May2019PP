package L28_July4;

import java.util.ArrayList;

import L25_June30.FxnGeneric.Car;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 04-Jul-2019
 *
 */

public class HGClient {

	public static void main(String[] args) {

		Car[] carr = new Car[5];

		carr[0] = new Car(10, 100, "Black");
		carr[1] = new Car(20, 90, "White");
		carr[2] = new Car(4, 60, "Brown");
		carr[3] = new Car(15, 50, "Grey");
		carr[4] = new Car(6, 80, "Red");

		HeapGeneric<Car> heapg = new HeapGeneric<>();

		for (int i = 0; i < 5; i++) {
			heapg.add(carr[i]);
		}

		while (!heapg.isEmpty()) {
			System.out.println(heapg.remove());
		}

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());
		lists.add(new ArrayList<>());

		lists.get(0).add(1);
		lists.get(0).add(8);
		lists.get(0).add(9);
		lists.get(0).add(10);
		lists.get(0).add(12);

		lists.get(1).add(5);
		lists.get(1).add(15);
		lists.get(1).add(20);

		lists.get(2).add(7);
		lists.get(2).add(13);
		lists.get(2).add(25);
		lists.get(2).add(30);

		lists.get(3).add(2);
		lists.get(3).add(3);

		// mergeKSortedLists(lists);

		kLargestElements(new int[] { 20, 100, 5, 2, 30, 40, 4 }, 3);

	}

	private static class Pair implements Comparable<Pair> {
		int data;
		int listNo;
		int idxNo;

		@Override
		public int compareTo(Pair o) {
			return o.data - this.data;
		}

	}

	public static void mergeKSortedLists(ArrayList<ArrayList<Integer>> lists) {

		HeapGeneric<Pair> heap = new HeapGeneric<>();

		// make a pair and put in heap
		for (int i = 0; i < lists.size(); i++) {
			Pair np = new Pair();
			np.data = lists.get(i).get(0);
			np.idxNo = 0;
			np.listNo = i;

			heap.add(np);
		}

		while (!heap.isEmpty()) {

			Pair rp = heap.remove();

			// print
			System.out.println(rp.data);

			// idx increase
			rp.idxNo++;

			// re-insert only when idx is in range
			if (rp.idxNo < lists.get(rp.listNo).size()) {
				rp.data = lists.get(rp.listNo).get(rp.idxNo);
				heap.add(rp);
			}

		}

	}

	public static void kLargestElements(int[] arr, int k) {

		Heap heap = new Heap();

		for (int i = 0; i < k; i++) {
			heap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {

			int ghp = heap.get();

			if (arr[i] > ghp) {
				heap.remove();
				heap.add(arr[i]);
			}

		}

		while (!heap.isEmpty()) {
			System.out.println(heap.remove());
		}

	}

}
