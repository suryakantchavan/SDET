package Strings;

public class LongestComonPalSubtr {

	public static void findLongPalStr(String str) {
		int maxLen = 0;
		int start = 0;
		for (int i = 1; i < str.length(); i++) {
			int low = i - 1;
			int high = i;

			while ((low >= 0 && high < str.length()) && str.charAt(low) == str.charAt(high)) {
				if (maxLen < high - low + 1) {
					start = low;
					maxLen = high - low + 1;
				}

				low--;
				high++;

			}

			low = i - 1;
			high = i + 1;
			while ((low >= 0 && high < str.length()) && str.charAt(low) == str.charAt(high)) {
				if (maxLen < high - low + 1) {
					start = low;
					maxLen = high - low + 1;
				}

				low--;
				high++;

			}

		}

		System.out.println(str.substring(start, start + maxLen));

	}

	public static void main(String[] args) {

		String s = "toothmadamsoooos";

		findLongPalStr(s);

	}
}
