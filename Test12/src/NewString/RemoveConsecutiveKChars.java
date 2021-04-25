package NewString;

import java.util.Stack;

class Pair {
	char c;
	int ctr;

	Pair(char c, int ctr) {
		this.c = c;
		this.ctr = ctr;
	}
}

public class RemoveConsecutiveKChars {

	// Function to find the reduced string
	public static String reduced_String(int k, String s) {
		// Base Case
		if (k == 1) {
			String ans = "";
			return ans;
		}

		// Creating a stack of type Pair
		Stack<Pair> st = new Stack<Pair>();

		// Length of the string S
		int l = s.length();
		int ctr = 0;

		// iterate through the string
		for (int i = 0; i < l; i++) {

			// if stack is empty then simply add the
			// character with count 1 else check if
			// character is same as top of stack
			if (st.size() == 0) {
				st.push(new Pair(s.charAt(i), 1));
				continue;
			}

			// if character at top of stack is same as
			// current character increase the number of
			// repetitions in the top of stack by 1
			if (st.peek().c == s.charAt(i)) {
				Pair p = st.peek();
				st.pop();
				p.ctr += 1;
				if (p.ctr == k) {
					continue;
				} else {
					st.push(p);
				}
			} else {

				// if character at top of stack is not
				// same as current charcter push the
				// character along with count 1 into the
				// top of stack
				st.push(new Pair(s.charAt(i), 1));
			}
		}

		// iterate through the stack
		// Use string(int,char) in order to replicate the
		// character multiple times and convert into string
		// then add in front of output string
		String ans = "";
		while (st.size() > 0) {
			char c = st.peek().c;
			int cnt = st.peek().ctr;
			while (cnt-- > 0)
				ans = c + ans;
			st.pop();
		}
		return ans;
	}

	// Driver code
	public static void main(String[] args) {
		int k = 2;
		String st = "geeksforgeeks";
		String ans = reduced_String(k, st);
		System.out.println(ans);
	}

	
}
