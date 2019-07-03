package L27_July3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Jul-2019
 *
 */

public class STClient {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 7, 6, -12, -8, 4, 9 };
		SegmentTree st = new SegmentTree(arr, new SegmentTreeProduct());
		st.display();

		System.out.println(st.query(2, 6));
		st.update(4, 10);
		System.out.println(st.query(2, 6));
	}
}
