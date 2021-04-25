package com.comparator;

public class RevserWithSepChar {
	
	
	public static void main(String[] args) {
		
		String s="test123@#$Ter";
		char arr[]=s.toCharArray();
		
		int low=0;
		int high=s.length()-1;
		while (low<high)
		{
			
			if(!Character.isAlphabetic(arr[low])) {
				low++;
			}
			
			else if(!Character.isAlphabetic(arr[high]))
			{
				high--;
			}
			
			else
			{
				char temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
				high--;
			}
		}
		
		
		System.out.println(new String(arr));
	}

}
