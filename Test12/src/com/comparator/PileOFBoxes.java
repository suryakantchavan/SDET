package com.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PileOFBoxes {

	public static void main(String[] args) {

		String s = "geeksforgeeks";
		String s1 = "mask";

		String str = "";
		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {
			list.add(s1.charAt(i));
		}

		for (int i = 0; i < s.length(); i++) {

			if (!list.contains(s.charAt(i))) {
				str = str + s.charAt(i);
			}
		}

		System.out.println(str);
	}

}
