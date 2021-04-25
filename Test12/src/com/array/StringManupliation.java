package com.array;

public class StringManupliation {

	public static void main(String[] args) {
		String s = "xy{2}bd{2}a{2}";

		String nstr = "";

		String temp1 = "";

		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i))) {
				nstr += s.charAt(i);
				temp1 = nstr;

			}

			else if (Character.isDigit(s.charAt(i))) {
				String str = s.charAt(i) + "";
				int count = Integer.parseInt(str);
				while (count > 1) {
					nstr = temp1 + nstr;
					count--;
				}

			}
		}

		System.out.println(nstr);

	}

};