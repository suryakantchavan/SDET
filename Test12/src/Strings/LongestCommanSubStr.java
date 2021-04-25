package Strings;

public class LongestCommanSubStr {

	public static int getLenOfLongestCommSubStr(String s1, String s2) {
		int max = 0;
		int dp[][] = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[1].length; j++) {
				char c1 = s1.charAt(i - 1);
				char c2 = s2.charAt(j - 1);

				if (c1 != c2) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}

				if (max < dp[i][j]) {
					max = dp[i][j];
				}

			}
		}

		return max;

	}

	public static void main(String[] args) {

		String s1 = "hsjaabcdkkds";
		String s2 = "hscab";

		int ans = getLenOfLongestCommSubStr(s1, s2);

		System.out.println(ans);
	}

}
