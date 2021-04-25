package com.j;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Check {
	
	public static void main(String[] args) {
		
		ArrayList<Character> set=new ArrayList<>();
		ArrayList<Character> set1=new ArrayList<>();
		String a="sadckodsijsnskljg";
		String b="coding";
		
		char arr[]=a.toCharArray();
		char arr1[]=b.toCharArray();
		
		
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);

		for(int j=0;j<arr1.length;j++)
		{
			set1.add(arr1[j]);
		}
		
		if(set.containsAll(set1))
		{
			System.out.println("hi");
		}
	}

}
