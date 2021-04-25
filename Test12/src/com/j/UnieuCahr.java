package com.j;

import java.util.HashMap;

public class UnieuCahr {

	public static void main(String[] args) {

		String s = "ababacd";

		String st = "";

		HashMap<Character, Boolean> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				continue;
			}

			else {
				st = st + s.charAt(i);
				map.put(s.charAt(i), true);
			}
		}

		System.out.println(st);
	}

}
