package L27_July3;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Jul-2019
 *
 */

public class SegmentTreeProduct implements STreeI {

	@Override
	public int type(int l, int r) {
		return l * r;
	}

	@Override
	public int defaultValue() {
		return 1;
	}

}
