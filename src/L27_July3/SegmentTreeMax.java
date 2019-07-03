package L27_July3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Jul-2019
 *
 */

public class SegmentTreeMax implements STreeI {

	@Override
	public int type(int l, int r) {
		return Math.max(l, r) ;
	}

	@Override
	public int defaultValue() {
		return Integer.MIN_VALUE ;
	}

}
