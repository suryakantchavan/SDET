package com.comparator;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {
	
	public static boolean isSubArrayExist(int arr[])
	{
			Set<Integer> set = new HashSet<>();
			int sum=0;
			
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
				
				
				if(sum==0|| arr[i]==0||set.contains(sum))
				{
					System.out.println(i);
					return true;
				}
				
				set.add(sum);
				
			}
		
		
		return false;
		
	}
	public static void main(String[] args) {
		int arr[] ={4, 2, -3, 1, 6};
		
		if(isSubArrayExist(arr))
		{
			System.out.println("sub array exist with sum zero");
		}
		
		else
		{
		 System.out.println("there is no sun array with sum zero");
		}
		
		
		
	}

}
