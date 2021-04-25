package com.comparator;

import java.util.ArrayList;

public class Test {

	public static void checkForConsecutiveOvel(String s) {
		String str = "aeiou";

		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}

		for (int i = 0; i < s.length()-1; i++) {
			if (list.contains(s.charAt(i)) && list.contains(s.charAt(i + 1))) {
				System.out.println(s);
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		String a[] = { "google", "suryakant", "eat", "swyyto" };

		for (int i = 0; i < a.length; i++) {
			checkForConsecutiveOvel(a[i]);
		}
	}

	// api

	// status code
	// patch request
	//
	//

}
