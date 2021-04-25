package com.array;

import java.util.Stack;

class GFG {

	// Function to find the subsequence
	// of length K forming valid sequence
	static String findString(String s, int k) {
		int n = s.length();

		// Stores the resultant String
		String ans = " ";
		Stack<Integer> st = new Stack<>();

		// Check whether character at
		// index i is visited or not
		boolean[] vis = new boolean[n];

		// Vector<boolean> vis(n, false);
		int count = 0;

		// Traverse the String
		for (int i = 0; i < n; ++i) {

			// Push index of open bracket
			if (s.charAt(i) == '(') {
				st.add(i);
			}

			// Pop and mark visited
			if (count < k && s.charAt(i) == ')') {
				vis[st.peek()] = true;
				st.pop();
				vis[i] = true;

				// Increment count by 2
				count += 2;
			}
		}

		// Append the characters and create
		// the resultant String
		for (int i = 0; i < n; ++i) {
			if (vis[i] == true) {
				ans += s.charAt(i);
			}
		}

		// Return the resultant String
		return ans;
	}

	// Driver Code
	public static void main(String[] args) {
		String s = "((()))";
		int K = 2;

		// Function call
		System.out.print(findString(s, K));
	}
}