package com.j;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntercstion {
	public static void printInterSection(int arr1[], int arr2[])
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			
			map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
		}
		
		
		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]))
			{
				int freq=map.get(arr2[i]);
				if(freq>0)
				{
					System.out.print(arr2[i]+" ");
					
					map.put(arr2[i], freq-1);
					
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr1[]= {2,6,1,2,9,8,7};
		int arr2[]= {1,2,3,4,2,7,9,8};
		printInterSection(arr1, arr2);
	}

}
