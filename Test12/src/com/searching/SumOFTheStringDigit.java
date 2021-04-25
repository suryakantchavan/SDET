package com.searching;

public class SumOFTheStringDigit {
	
	public static void main(String[] args) {
		
		String s="12jhbsdv12jkb12";
		
		String a[]= s.split("[^0-9]");
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(!a[i].isEmpty())
			{
				sum=sum+Integer.parseInt(a[i]);
			}
		}
		
		System.out.println(sum);
	}

}
