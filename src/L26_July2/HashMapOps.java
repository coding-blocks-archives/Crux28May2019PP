package L26_July2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 02-Jul-2019
 *
 */

public class HashMapOps {

	public static void main(String[] args) {

		System.out.println(highestFrequency("aabbbbbbccddaa"));
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };

		longestConsecutiveSeq(arr);

	}

	public static char highestFrequency(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				int of = map.get(ch);
				int nf = of + 1;
				map.put(ch, nf);
			} else {
				map.put(ch, 1);
			}
		}

		int maxFreq = 0;
		char maxChar = ' ';

		for (char key : map.keySet()) {

			int val = map.get(key); // freq

			if (val > maxFreq) {
				maxFreq = val;
				maxChar = key;
			}

		}

		return maxChar;

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < one.length; i++) {

			int val = one[i];

			if (map.containsKey(val)) {
				int of = map.get(val);
				int nf = of + 1;
				map.put(val, nf);
			} else {
				map.put(val, 1);
			}
		}

		for (int j = 0; j < two.length; j++) {

			int val = two[j];

			if (map.containsKey(val) && map.get(val) > 0) {
				ans.add(val);
				map.put(val, map.get(val) - 1);
			}

		}

		return ans;

	}

	public static void longestConsecutiveSeq(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int val = arr[i];

			if (map.containsKey(val - 1)) {
				map.put(val, false);
			} else {
				map.put(val, true);
			}

			if (map.containsKey(val + 1)) {
				map.put(val + 1, false);
			}

		}

		int maxCount = 0;
		int starting = 0;

		for (int key : map.keySet()) {

			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count)) {
					count++;
				}

				if (count > maxCount) {
					maxCount = count;
					starting = key;
				}

			}

		}

		for (int i = 0; i < maxCount; i++) {
			System.out.println(starting + i);
		}

	}

}
