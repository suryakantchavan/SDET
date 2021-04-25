package com.searching;

public class ArrayPairwithHigestSum {
	
	
	public static void main(String[] args) {
		
		int a[]= {12,80,23,56};
		
		
		int  f,s;
		
		if(a[0]>a[1])
		{
			f=a[0];
			s=a[1];
		}
		
		else
		{
			f=a[1];
			s=a[0];
		}
		
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>f)
			{
				s=f;
				f=a[i];
			}
			
			else if(a[i]>s && 	a[i]!=f)
			{
				  s=a[i];
			}
		}
		
		System.out.println(f+s);
	}

}
