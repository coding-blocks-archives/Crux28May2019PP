package L25_June30.FxnGeneric;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class StudentComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.rollNo - o2.rollNo;
	}

}
