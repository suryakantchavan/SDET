package com.j;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		int temp[]= new int[arr.length];
		int count=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			temp[count++]=arr[i];
		}
		
		for(int i=0;i<temp.length;i++)
		{
			
			System.out.print(temp[i]+" ");
		}
	}

}
