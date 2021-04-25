package com.comparator;

public class Pal {

	public static boolean isPalindrome(String s, int start, int end) {
		if (start > end) {
			return false;
		}

		if (start == end) {
			return true;
		}

		if (s.charAt(start) == s.charAt(end))

			return isPalindrome(s, start + 1, end - 1);
		return false;

	}

	public static void main(String[] args) {

		String s = "121";
		System.out.println(isPalindrome(s, 0, s.length() - 1));
	}

}
