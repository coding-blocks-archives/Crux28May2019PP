package L25_June30.InterfaceStory;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 30-Jun-2019
 *
 */

public class Stack implements DSI {

	@Override
	public void push(int item) {
		System.out.println("in push");
	}

	public int fun(int a) {
		System.out.println("fun");
		return 0;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
