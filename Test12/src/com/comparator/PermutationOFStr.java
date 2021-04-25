package com.comparator;

public class PermutationOFStr {

	public static void getPermutations(String str, int start, int end) {
		if (start == end) {
			System.out.println(str);
		}

		else {

			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				getPermutations(str, start + 1, end);
				str = swap(str, start, i);

			}
		}

	}

	public static String swap(String s, int start, int i) {

		char a[] = s.toCharArray();
		char temp = a[start];
		a[start] = a[i];
		a[i] = temp;

		return new String(a);

	}

	public static void main(String[] args) {

		String s = "ABC";

		getPermutations(s, 0, s.length() - 1);
	}

}
