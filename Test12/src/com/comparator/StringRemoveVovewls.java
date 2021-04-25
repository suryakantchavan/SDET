package com.comparator;

import java.util.ArrayList;

public class StringRemoveVovewls {

	public static void main(String[] args) {

		String s = "This is sarvesh";

		String temp = "aeiou";
		
		String newstr="";
		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < temp.length(); i++) {
			list.add(temp.charAt(i));
		}
		
	
		for(int i=0;i<s.length();i++)
		{
			if(list.contains(s.charAt(i)))
			{
				continue;
			}
			else
			{
				newstr= newstr+s.charAt(i);
			}
		}
		

		System.out.println(newstr);
	}

}
