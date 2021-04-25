package com.j;

public class ReverseStringWithSpecialChar {
	
	
	public static void main(String[] args) {
		
		String s="abc*h&j@de&*%$";
		
		char a[]=s.toCharArray();
		
		int low=0;
		int high=a.length-1;
		
		while(low<high)
		{
			if(!Character.isAlphabetic(a[low]))
			{
				low++;
			}
			
			else if(!Character.isAlphabetic(a[high]))
			{
				high--;
			}
			
			
			else
			{
				char temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				low++;
				high--;
			}
			
		}
		
		
		System.out.println(new String(a));
	}

}
