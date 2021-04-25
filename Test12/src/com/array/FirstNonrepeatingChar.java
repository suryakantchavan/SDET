package com.array;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonrepeatingChar {
	
	public static void getFirstNonRepeatingChar(String s ) {
		
		LinkedHashMap<Character, Integer> map= new LinkedHashMap<>();
		
			for(int i=0;i<s.length();i++)
			{
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			}
			
		
			for(Map.Entry<Character, Integer> entery: map.entrySet())
			{
				if(entery.getValue()==1)
				{
					System.out.println(entery.getKey());
					break;
				}
			}
		
			//map.clear();
		
	}
	
	
	public static void main(String[] args) {
		
		String s="ThTis is my first line";
		
		String arr[]=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			String temp=arr[i];
			
				getFirstNonRepeatingChar(temp);
		}
	}

}
