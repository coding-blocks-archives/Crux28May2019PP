package L4_June2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jun-2019
 *
 */

public class FunctionDemo {

	static int val = 10;

	public static void main(String[] args) {

		System.out.println("hello");

		// Part-1
		System.out.println("----------- Part-1 -----------");
		addition();
		subtraction();

		// Part-2
		System.out.println("----------- Part-2 -----------");
		int n1 = 10;
		int n2 = 20;
		additionParams(n1, n2);

		// Part-3
		System.out.println("----------- Part-2 -----------");
		int sum = additionParamsReturn(50, 60);
		System.out.println(sum);

		// Part-4
		System.out.println("----------- Part-4 -----------");
		int one = 10, two = 20;
		int summ = DemoScopes(one, two);
		System.out.println(summ);

		// Part-5
		System.out.println(val); // 10
		int val = 100;
		System.out.println(val); // 100
		System.out.println(FunctionDemo.val); // 10

		one = 10;
		int ans = DemoGlobalScopes(one);
		System.out.println(FunctionDemo.val);
		System.out.println(ans);

		// Part-6 : Pass by value
		System.out.println("----------- Part-6 -----------");
		one = 10;
		two = 20;
		System.out.println(one + ", " + two);
		Swap(one, two);
		System.out.println(one + ", " + two);

		System.out.println("bye");

	}

	public static void Swap(int one, int two) {
		System.out.println(one + ", " + two);

		int temp = one;
		one = two;
		two = temp;

		System.out.println(one + ", " + two);
	}

	public static int DemoGlobalScopes(int one) {

		FunctionDemo.val = 90;

		int val = 100;

		int sum = one + FunctionDemo.val;
		return sum;
	}

	public static int DemoScopes(int one, int another) {

		int sum = one + another;
		return sum;
	}

	public static int additionParamsReturn(int a, int b) {

		// int sum = a + b;

		return a;
		// return a + b;
		// System.out.println("hello");
	}

	public static void additionParams(int a, int b) {

		// a = 10;
		// b = 20;
		int sum = a + b;

		System.out.println(sum);

	}

	// function definition
	public static void addition() {
		int a = 2;
		int b = 3;

		int sum = a + b;

		System.out.println(sum);

		subtraction();
	}

	// function definition
	public static void subtraction() {
		int a = 20;
		int b = 3;

		int sub = a - b;

		System.out.println(sub);
	}

}
