package com.j;

import java.util.Arrays;

public class AnagraminCOuntWay {

	public static boolean isAnagram(String s, String s1) {
		int count1 = 0, count2 = 0;

		for (int i = 0; i < s.length(); i++) {
			count1 = count1 + s.charAt(i);
		}
		for (int i = 0; i < s1.length(); i++) {
			count2 = count2 + s1.charAt(i);
		}

		if (count1 == count2) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		String s = "kaka";
		String s1 = "kkaa";

		boolean ans = isAnagram(s, s1);

		System.out.println(ans);

	}

}
