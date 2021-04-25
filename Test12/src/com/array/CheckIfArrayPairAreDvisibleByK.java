package com.array;

import java.util.HashMap;

public class CheckIfArrayPairAreDvisibleByK {
	
	
	public static boolean checkIsDivisble(int arr[], int k)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int rem=arr[i]%k;
			
			if(map.containsKey(rem))
			{
				map.put(rem, map.get(rem)+1);
			}
			else
			{
				map.put(rem, 1);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int rem=arr[i]%k;
			
			
			if(rem==0)
			{
				int freq=map.get(rem);
				if(freq%2==1)
				{
				System.out.println("false");
				return false;
				}
			}
			
			else if(2*rem==k)
			{
				int freq=map.get(rem);
				if(freq%2==1)
				{
				System.out.println("false");
				return false;
				}
				
			}
			
			else
			{
				int frq=map.get(rem);
				int ofq=map.getOrDefault(k-rem, 0);
				if(frq!=ofq)
				{
					System.out.println("false");
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		 int arr[] = { 92, 75, 65, 48, 45, 35};
		 
		 int k=10;
		 
		boolean ans= checkIsDivisble(arr, k);
		System.out.println(ans);
	}

}
