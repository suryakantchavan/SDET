package com.searching;

import java.util.HashMap;

public class PariSuminArray {
	
	
	public static void main(String[] args) {
		
		int a[]= {3,7,2,8,8};
		
		int sum=10;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		
		for(int i=0;i<a.length;i++)
		{
			int rem=sum-a[i];
			
			if(map.containsKey(rem))
			{
				int count=map.get(rem);
				
					for(int j=0;j<count;j++)
					{
						System.out.println("("+rem+" , "+a[i]+")");
					}
			}
			
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
	
		//@Test
		
		
		
	}

}
