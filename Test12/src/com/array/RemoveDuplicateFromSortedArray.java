package com.array;

public class RemoveDuplicateFromSortedArray {
	
	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,3,4,4};
		
		int j=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
						
			}
		}
		
		
		a[j]=a[a.length-1];
		j++;
		
		
		while(j<a.length)
		{
			a[j]=0;
			j++;
		}
		
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
