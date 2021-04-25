package com.comparator;

public class Secondlargest {
	
	
	public static void main(String[] args) {
		 int arr[] = { 12};
		 
		 if(arr.length<2)
		 {
			 System.out.println("invalid input");
			 return;
		 }
		 
		 
		 int second;
		 int first=second=Integer.MIN_VALUE;
		 
		 
		 //get first max
		 
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 first=Math.max(first, arr[i]);
		 }
		 
		//get second 
		 
		 for(int j=0;j<arr.length;j++)
		 {
			 if(arr[j]!=first)
			 {
				 second=Math.max(second, arr[j]);
			 }
		 }
		 
		 
		 
		 if(second==Integer.MIN_VALUE)
		 {
			 System.out.println("second higest doesn't exit");
		 }
		 
		 else
		 {
			 System.out.println("second is" +second);
		 }
	}
	

}
