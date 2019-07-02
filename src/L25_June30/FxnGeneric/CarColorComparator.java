package L25_June30.FxnGeneric;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class CarColorComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.color.compareTo(o2.color);
	}

}
