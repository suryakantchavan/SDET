package com.j;

import java.util.Arrays;

public class AnagramString {

	public static boolean isAnagram(String s, String s1) {
		char arr[] = s.toCharArray();
		char arr1[] = s1.toCharArray();

		Arrays.sort(arr);
		Arrays.sort(arr1);

		String temp = new String(arr);
		String temp1 = new String(arr1);

		if (temp.equals(temp1)) {

			return true;
		}
		String sss="Alex";
		return false;

	
	}

	public static void main(String[] args) {

		String s = "12234";
		String s1 = "13421";

		boolean ans = isAnagram(s, s1);

		System.out.println(ans);

	}

}
