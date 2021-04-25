package com.searching;

public class BinaraySearch12 {
	
	public static int bSearch(int a[], int key, int low, int high)
	{
		if(low>high)
		{
			return -1;
		}
		
		
		int mid=(low+high)/2;
		
		if(a[mid]==key)
		{
			return mid;
		}
		
		
		else if(key<a[mid])
		{
			return bSearch(a, key, low, mid-1);
		}
		
		else
		{
			return bSearch(a, key, mid+1,high );
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int key=9;
		
		int Ans=bSearch(a, key ,0,a.length-1);
		System.out.println(Ans);
	}

}
