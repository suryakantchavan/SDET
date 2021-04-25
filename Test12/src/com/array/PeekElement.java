package com.array;

public class PeekElement {
	
	public static void main(String[] args) {
		int a[]= {5,5,2,5,3};
		
		
		int count=0;
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] &&  a[i]>a[i+1])
			{
				System.out.println(a[i]);
				count++;
			}
		}
		
		
		if(count==0)
		{
			System.out.println("no such ele");
		}
	}

}
