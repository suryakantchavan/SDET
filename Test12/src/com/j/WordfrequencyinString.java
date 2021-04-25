package com.j;

import java.util.HashMap;

public class WordfrequencyinString {

	public static void main(String[] args) {
		
		String s="they are good and they are also very good but they should be not to good and also bad";
		
		String arr[]=s.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			
		map.put(arr[i], map.getOrDefault(arr[i],0)+1);
			
		
		}
		
		System.out.println(map);
	}
	
}
