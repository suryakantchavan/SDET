package Strings;

public class MinWindowSubSeq {

	public static String findMinWindwSeq(String str, String ptr) {
		int str_len = str.length();
		int ptr_len = ptr.length();

		int ascii_str[] = new int[256];
		int ascii_ptr[] = new int[256];

		for (int i = 0; i < ptr_len; i++) {
			ascii_ptr[ptr.charAt(i)]++;
		}
		int count = 0;
		int start = 0;
		int start_index = -1;
		int min_window = Integer.MAX_VALUE;

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

				int wind_size = j - start + 1;

				if (min_window > wind_size) {
					min_window = wind_size;
					start_index = start;
				}

			}

		}

		return str.substring(start_index, start_index + min_window);

	}

	public static void main(String[] args) {
		String str = "ACDEBBANC";
		String ptr = "ABC";

		String ans = findMinWindwSeq(str, ptr);
		System.out.println(ans);
	}
}
