package com.searching;

import java.util.ArrayList;
import java.util.Collections;

public class CopyAllZeroToLeft {
	
	
	public static void main(String[] args) {
		
	Integer arr[] = {1, 2, 3, 5, 4, 7, 10};
		ArrayList<Integer> odd= new ArrayList<>();
		ArrayList<Integer> odd1= new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			
			else
			{
				odd.add(arr[i]);
				
			}
		}
		
		
		Collections.sort(odd);
		Collections.sort(even);
		
		 for (int i = odd.size() - 1; i >= 0; i--) { 
			 	
			 odd1.add(odd.get(i));
		 
		 }
		
		 odd1.addAll(even);
	  
		Object cc []=odd1.toArray();
		
		
		for(int i=0;i<cc.length;i++)
		{
			System.out.println(cc[i]);
		}
		 
	}

}
