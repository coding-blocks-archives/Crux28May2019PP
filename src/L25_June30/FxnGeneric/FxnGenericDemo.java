package L25_June30.FxnGeneric;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 30-Jun-2019
 *
 */

public class FxnGenericDemo {

	public static void main(String[] args) {

		Integer[] arr = { 100, 20, 30, 40 };
		display(arr);

		String[] arrs = { "hello", "hi", "bye" };
		display(arrs);

		Car[] carr = new Car[5];

		carr[0] = new Car(10, 100, "Black");
		carr[1] = new Car(20, 90, "White");
		carr[2] = new Car(4, 60, "Brown");
		carr[3] = new Car(15, 50, "Grey");
		carr[4] = new Car(6, 80, "Red");

		display(carr);

		// bubbleSort(carr);
		bubbleSort(carr, new CarSpeedComparator());
		display(carr);
		bubbleSort(carr, new CarPriceComparator());
		display(carr);
		bubbleSort(carr, new CarColorComparator());
		display(carr);

		bubbleSort(arr, new IntegerComparator());
		display(arr);

		Student[] arrstu = new Student[3];

		arrstu[0] = new Student(1, "raman");

		arrstu[1] = new Student(10, "mohit");
		arrstu[2] = new Student(2, "rohit");

		bubbleSort(arrstu, new StudentComp());
		display(arrstu);
	}

	public static <T> void display(T[] arr) {

		System.out.println("----------------");
		for (T val : arr) {
			System.out.println(val);
		}
		System.out.println("----------------");

	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		int n = arr.length;

		for (int counter = 0; counter <= n - 2; counter++) {

			for (int j = 0; j <= n - counter - 2; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> comp) {

		int n = arr.length;

		for (int counter = 0; counter <= n - 2; counter++) {

			for (int j = 0; j <= n - counter - 2; j++) {

				if (comp.compare(arr[j], arr[j + 1]) > 0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

}
