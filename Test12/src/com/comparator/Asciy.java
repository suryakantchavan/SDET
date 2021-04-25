package com.comparator;

public class Asciy {

	public static void main(String[] args) {

		String s = "ABC";

		for (int j = 0; j < 3; j++) {
			String str = "";
			for (int i = 0; i < 2; i++) {
				int num = s.charAt(i) - j;
				char c = (char) num;

				str = str + s.charAt(i);

			}
			System.out.println(str);

		}

	}

}
