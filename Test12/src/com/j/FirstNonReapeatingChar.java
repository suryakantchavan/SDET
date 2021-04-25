package com.j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonReapeatingChar {
	public static void main(String[] args) {

		String s = "prabhupada";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}

			else {
				map.put(s.charAt(i), 1);
			}

		}

		for (Entry<Character, Integer> i : map.entrySet()) {
			if (i.getValue() == 1) {
				System.out.println(i.getKey());
				break;
			}

		}
	}

}
