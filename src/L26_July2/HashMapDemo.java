package L26_July2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		// put
		map.put("India", 100);
		map.put("Eng", 45);
		map.put("SL", 23);

		System.out.println(map);

		map.put("SL", 30);

		System.out.println(map);

		// get
		System.out.println(map.get("India"));
		System.out.println(map.get("Aus"));

		// conatinsKey
		System.out.println(map.containsKey("India"));
		System.out.println(map.containsKey("SLL"));

		// remove
		System.out.println(map);
		System.out.println(map.remove("SL"));
		System.out.println(map.remove("Aus"));

		// getOrDefault
		System.out.println(map.getOrDefault("Indiaa", 0));

		// keySet
		// way 1
		Set<String> keys = map.keySet();

		for (String key : keys) {
			System.out.println(key);
		}

		// way2
		for (String key : map.keySet()) {
			System.out.println(key);
		}

		// way 3
		ArrayList<String> list = new ArrayList<>(map.keySet());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			list.set(i, "abc");

		}

		System.out.println(list);

		System.out.println(map.keySet());

	}
}
