package com.searching;

public class PrintFirstChar {

	
	public static void main(String[] args) {
		
		String s="Hello User!! Welcome";
		
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].charAt(0));
		}
	}
}
