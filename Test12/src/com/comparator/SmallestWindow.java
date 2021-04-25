package com.comparator;

public class SmallestWindow {

	public static String findMinWindow(String str, String ptr) {

		int str_len = str.length();
		int ptr_len = ptr.length();

		int ascii_ptr[] = new int[256];
		int ascii_str[] = new int[256];

		for (int i = 0; i < ptr_len; i++) {

			ascii_ptr[ptr.charAt(i)]++;
		}

		int start = 0;
		int count = 0;
		int start_index = -1;
		int min_len = Integer.MAX_VALUE;

		for (int j = 0; j < str_len; j++) {
			ascii_str[str.charAt(j)]++;

			if (ascii_ptr[str.charAt(j)] != 0 && ascii_str[str.charAt(j)] <= ascii_ptr[str.charAt(j)]) {
				count++;
			}

			if (count == ptr_len) {
				while (ascii_str[str.charAt(start)] > ascii_ptr[str.charAt(start)]
						|| ascii_ptr[str.charAt(start)] == 0) {

					if (ascii_str[str.charAt(start)] > ascii_ptr[str.charAt(start)]) {
						ascii_str[str.charAt(start)]--;
						start++;
					}
				}

				int len_window = j - start + 1;
				if (min_len > len_window) {
					min_len = len_window;
					start_index = start;
				}

			}
		}

		return str.substring(start_index, start_index + min_len);

	}

	public static void main(String[] args) {

		String str = "ADOBECODEBAC";

		String ptr = "ABC";

		String ans = findMinWindow(str, ptr);
		System.out.println(ans);

	}
}
