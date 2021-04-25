package com.j;

import java.util.Stack;

public class ReservseStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> input = new Stack<>();
		Stack<Integer> empty= new Stack<>();
		
		int arr[]= {1,2,3,4,5,10};
		
		for(int i=0;i<arr.length;i++)
		{
			
			input.push(arr[i]);
		}
		
	
	
		while(!input.isEmpty())
		{
			
			empty.push(input.pop());
		}
		
		input=empty;
		



		while(!input.isEmpty())
		{
			
			System.out.print(input.pop()+" ");
		}
	
		
	
	
	
}
	
}
