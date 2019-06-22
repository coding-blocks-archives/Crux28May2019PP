package L17_June21;

import L16_June20.Stack;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Jun-2019
 *
 */

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {

		if (isFull()) {

			// create a new array of twice size
			int[] na = new int[2 * data.length];

			// copy all the old elements
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}

			// refernce change
			data = na;

		}

		super.push(item);
	}
}
