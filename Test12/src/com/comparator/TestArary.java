package com.comparator;

public class TestArary {

	public static void main(String[] args) {

		int a[] = { 0,1,0,1,0,1,1,0,0,1,0};
		
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=1)
			{
				a[count++]=a[i];
			}
		}
		
		
		while(count<a.length)
		{
			a[count++]=1;
		}

		
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}