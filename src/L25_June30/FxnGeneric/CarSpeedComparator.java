package L25_June30.FxnGeneric;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class CarSpeedComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.speed - o2.speed ;
	}

	
}














