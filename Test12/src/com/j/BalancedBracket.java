package com.j;

import java.util.Stack;

public class BalancedBracket {
	
	
	public static void main(String[] args) {
		
		String str="{{( )}}";
		
		
		
		IsBalancedSolution sol= new IsBalancedSolution();
		boolean isBal=sol.isBalanced(str);

		if(isBal)
		System.out.println("brackets are balanced");
		else
			System.out.println("brackets are not balanced");
				
	}

}
