package L27_July3;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 03-Jul-2019
 *
 */

public class TrieClient {

	public static void main(String[] args) {

		// System.out.println(isPatternPresent("abcdefgh", "cde"));

		Trie trie = new Trie();
		trie.addWord("and");
		trie.addWord("arc");
		trie.addWord("an");
		trie.addWord("ant");
		trie.addWord("be");
		trie.addWord("been");
		System.out.println(trie.searchWord("bea"));

		trie.removeWord("be");
		trie.removeWord("been");
		trie.display();

		ArrayList<String> list = new ArrayList<>();
		list.add("oath");
		list.add("pea");
		list.add("eat");

		char[][] carr = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };

		WordSearch2(carr, list);

	}

	public static int isPatternPresent(String src, String pattern) {

		for (int i = 0; i <= src.length() - pattern.length(); i++) {

			int j = 0;

			while (j < pattern.length()) {

				if (src.charAt(i + j) != pattern.charAt(j)) {
					break;
				}

				j++;

			}

			if (j == pattern.length()) {
				return i;
			}

		}

		return -1;

	}

	// https://leetcode.com/problems/word-search-ii/

	public static void WordSearch2(char[][] arr, ArrayList<String> list) {

		Trie trie = new Trie();
		HashSet<String> set = new HashSet<>();

		for (String val : list) {
			trie.addWord(val);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				search(i, j, new boolean[arr.length][arr[0].length], "", arr, trie, set);
			}
		}

		System.out.println(set);

	}

	private static void search(int row, int col, boolean[][] visited, String str, char[][] arr, Trie trie,
			HashSet<String> set) {

		if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || visited[row][col])
			return;

		if (!trie.startsWith(str)) {
			return;
		}

		if (trie.searchWord(str)) {
			set.add(str);
		}

		visited[row][col] = true;

		search(row + 1, col, visited, str + arr[row][col], arr, trie, set);
		search(row, col + 1, visited, str + arr[row][col], arr, trie, set);
		search(row - 1, col, visited, str + arr[row][col], arr, trie, set);
		search(row, col - 1, visited, str + arr[row][col], arr, trie, set);

		visited[row][col] = false;

	}

}
