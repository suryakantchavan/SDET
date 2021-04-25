package com.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;


public class SortAlphaNUmericTSring {

	
	public static void main(String[] args) {
		
	String str="geeks12for32geeks";
	
	String s1[]=str.split("[0-9]");
	String s2[]=str.split("[^0-9]");
	Arrays.sort(s1);
	Arrays.sort(s2);
	for(int i=0;i<s1.length;i++)
	{
		System.out.println(s1[i]);
	}
	
	
	ArrayList<Integer> l= new ArrayList<>();
	
	char a[]=str.toCharArray();
	Arrays.sort(a);
	
	for(int i=0;i<str.length();i++)
	{
		if(Character.isDigit(str.charAt(i)))
		{
			l.add(str.indexOf(str.charAt(i)));
		}
	}
	
		
	System.out.println(l);
	}
}
