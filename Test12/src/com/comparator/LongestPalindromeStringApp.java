package com.comparator;

public class LongestPalindromeStringApp {

	public static int lpSubstring(String str, int start, int end) {
		if (start > end) {
			return 0;
		}

		if (start == end) {
			return 1;
		}

		if (str.charAt(start) == str.charAt(end)) {
			int lpsRemainingString = end - start - 1;

			if (lpsRemainingString == lpSubstring(str, start + 1, end - 1)) {
				return 2 + lpsRemainingString;
			}
		}
	
		return Math.max(lpSubstring(str, start + 1, end), lpSubstring(str, start, end - 1));
	}

	

	public static void main(String[] args) {
		String str = "forgeeksskeegfor";

		System.out.println(LongestPalindromeStringApp.lpSubstring(str, 0, str.length() - 1));

		
	}

}