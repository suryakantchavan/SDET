package com.searching;

public class LCS {

	public static int lcs(String str1, String str2, int m, int n) {
		if (m == str1.length() || n == str2.length()) {
			return 0;
		}
		int myAns;

		if (str1.charAt(m) == str2.charAt(n)) {
			int smallAns = lcs(str1, str2, m + 1, n + 1);
			myAns = 1 + smallAns;
		}

		else {
			int ans1 = lcs(str1, str2, m + 1, n);
			int ans2 = lcs(str1, str2, m, n + 1);
			myAns = Math.max(ans1, ans2);

		}

		return myAns;

	}

	public static void main(String[] args) {
		String str1 = "abmgc";

		String str2 = "ahnbfdmfdgs";

		int ans = lcs(str1, str2, 0, 0);
		System.out.println(ans);
	}

}
