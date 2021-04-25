package Strings;

import java.util.HashMap;

public class LongestSubstWithoutReapeatingChar {

	public static int longestSubStrwithoutRepeaitingChar(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}

		int start = 0;
		int end = 0;
		int maxLen = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		while (end < s.length()) {
			char currentChar = s.charAt(end);
			if (map.containsKey(currentChar)) {

				start = Math.max(start, map.get(currentChar) + 1);

			}

			map.put(currentChar, end);

			maxLen = Math.max(end - start + 1, maxLen);
			end++;

		}

		return maxLen;

	}

	public static void main(String[] args) {

		String s = "abcabcbb";
		int ans = longestSubStrwithoutRepeaitingChar(s);
		System.out.println(ans);

	}

}
