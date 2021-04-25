package com.comparator;

import java.util.HashMap;
import java.util.HashSet;

public class PairWithSumK {
	
	public static void main(String[] args) {
		
		int arr[]= {3,1,3,4,3};
		int sum=6;
		
		HashSet<Integer> set = new HashSet<>();
		
			
			
			int count=0;
			
			for(int i=0;i<arr.length;i++)
			{
				int diff=sum-arr[i];
				if(set.contains(diff))
				{
					System.out.println("pair are");
					System.out.println();
					System.out.print("("+arr[i]+","+" "+diff+")");
					System.out.println();
				
					
				
				}
				set.add(arr[i]);
				
				
			}
			
			
			
	}

}
