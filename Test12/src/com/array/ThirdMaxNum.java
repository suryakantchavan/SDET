package com.array;

import java.util.Iterator;
import java.util.TreeSet;

public class ThirdMaxNum {

	public static void main(String[] args) {
		int a[] = { 2, 2, 3, 1 };

		TreeSet<Integer> set = new TreeSet<>();

		for (Integer i : a) {
			set.add(a[i]);
			

		};
		
		
	Iterator<Integer>	i=set.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}
}