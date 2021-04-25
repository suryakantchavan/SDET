package com.stack;

import java.util.Stack;

public class StackSpan {

	public static void main(String[] args) {

		int a[] = { 60, 70, 80, 100, 90, 75, 80, 120 };

		int output[] = new int[a.length];

		Stack<Integer> st = new Stack<>();
		st.push(0);
		output[0] = 1;
		for (int i = 1; i < a.length; i++) {
			while (!st.isEmpty() && a[st.peek()] < a[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				output[i] = i + 1;
			}

			else {
				output[i] = i - st.peek();
			}

			st.push(i);
		}

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}