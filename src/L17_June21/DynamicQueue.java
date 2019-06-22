package L17_June21;

import L16_June20.Queue;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 21-Jun-2019
 *
 */

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {

		if (isFull()) {

			int[] na = new int[2 * data.length];

			for (int i = 0; i < size; i++) {
				int idx = (i + front) % data.length;
				na[i] = data[idx];
			}

			// ref change
			data = na;
			front = 0;

		}
		
		super.enqueue(item);

	}
}






