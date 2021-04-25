package NewString;

public class LongestPalindromicSubstr {

	public static void findAns(String s) {
		int start = 0;
		int max_len = Integer.MAX_VALUE;

		for (int i = 1; i < s.length(); i++) {

			int low = i - 1;
			int high = i;

			while ((low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high))) {

				if (max_len >high + low - 1) {
					start = low;
					max_len = high + low - 1;
				}

				low--;
				high++;

			}

			low = i - 1;
			high = i + 1;

			while ((low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high))) {

				if (max_len > high + low - 1) {
					start = low;
					max_len = high + low - 1;
				}

				low--;
				high++;

			}

		}
		
		
		System.out.println(s.substring(start, start+max_len));

	}

	public static void main(String[] args) {

		String s = "twotoot";
		findAns(s);

	}

}
