package com.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomSorting {

	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> set= new TreeSet<>(new MyCustomComparator());
		
		set.add(10);
		set.add(0);
		set.add(5);
		set.add(15);
		set.add(20);
		set.add(20);
		System.out.println(set);
	}
	
}


	 class MyCustomComparator implements Comparator<Integer>
	 {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			if(o1<o2)
			{
				return 1;
			}
			
			else if(o1>o2)
			{
				return -1;
			}
			
			else
			return 0;
		}
		 
	 }