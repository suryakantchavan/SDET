package com.comparator;



public class StringRerravnge {

	public static String geneate(String s, int i) {

		String newChar = "";
		if (i == 0) {
			return Character.toUpperCase(s.charAt(i)) + "";
		} else {
			for (int count = 0; count < i; count++) {
				if (Character.isUpperCase(s.charAt(i))) {
					newChar = newChar + Character.toLowerCase(s.charAt(i));
				} else {
					newChar = newChar + s.charAt(i);
				}

			}

			return Character.toUpperCase(s.charAt(i)) + newChar;
		}

		// Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu
		// Z-Pp-Ggg-Llll-Nnnnn-RRRRRR-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-UUUUUUUUUUU

	}

	public static void main(String[] args) {

		String s = "Ahy";
		// "A-Bb-Ccc-Dddd

		String str = "";

		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - 1) {

				str = str + geneate(s, i);
			} else {
				str = str + geneate(s, i) + "-";
			}
		}

		System.out.println(str);
	}
}