package com.searching;

public class ReverseWithoutSpecsilChar {
	
	
	
	public static void main(String[] args) {
		
		String str="sad@gc";
		
		char arr[]=str.toCharArray();
		
		int l=0;
		int h=arr.length-1;
		
		while(l<h)
		{
			if(!Character.isAlphabetic(arr[l]))
				l++;
			else if(!Character.isAlphabetic(arr[h]))
				h--;
			else
			{
				char temp=arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
				l++;
				h--;
			}
			
		}
		
			
		String s= new String(arr);
		System.out.println(s);
	}

}
