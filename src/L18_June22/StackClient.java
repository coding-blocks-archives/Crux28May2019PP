package L18_June22;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 22-Jun-2019
 *
 */

public class StackClient {

	public static void main(String[] args) throws Exception {
		
		StackUsingQueuePushEff stack = new StackUsingQueuePushEff() ;
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("--");
		System.out.println(stack.pop());
		System.out.println("--");
		stack.display();
	}
}










