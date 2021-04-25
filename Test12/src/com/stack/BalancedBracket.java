package com.stack;

import java.util.Stack;

public class BalancedBracket {

	public static boolean isBalanced(String s) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
			}
			
			
			else if(s.charAt(i)=='}' || s.charAt(i)==')')
			{
				if(st.isEmpty())
				{
					return false;
				}
				
				char top=st.peek();
				if(top=='(' && s.charAt(i)==')' || top=='{' && s.charAt(i)=='}')
				{
					st.pop();
				}
			}
		}

		return st.isEmpty();

	}

	public static void main(String[] args) {

		String s = "{(})";

		boolean ans = isBalanced(s);
		System.out.println(ans);

	}

}
