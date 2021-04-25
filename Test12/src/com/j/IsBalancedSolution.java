package com.j;

import java.util.Stack;

public class IsBalancedSolution {

	public boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(' || str.charAt(i) == '{') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == ')' || str.charAt(i) == '}') {
				if (stack.isEmpty()) {
					return false;
				}

				char topChar = stack.pop();
				if (str.charAt(i) == ')' && topChar == '(' || str.charAt(i) == '}' && topChar == '{') {
					continue;
				} 
				else

				{
					return false;
				}

			}
//String str="{{( )}}";
		}

		return stack.isEmpty();

	}

}
