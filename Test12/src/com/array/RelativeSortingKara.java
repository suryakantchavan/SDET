package com.array;

import java.util.HashMap;

public class RelativeSortingKara {
	
	
	public static void doRelativeSorting(int first[], int second[])
	{
		
			HashMap<Integer, Integer> freq=new  HashMap<Integer, Integer>();
		
		
	}
	

	public static void main(String[] args) {
		
		int first[] = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 1, 8, 4 };

		int second[] = { 3, 5, 7, 2 };
		
		doRelativeSorting(first, second);
		
		for(int i=0;i<first.length;i++)
		{
			
			System.out.print(first[i]+" ");
		}
		
		
	}

}
