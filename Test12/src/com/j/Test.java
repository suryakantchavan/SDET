package com.j;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		String str = "java100df10s20sdsa30ds01";
		
		String arr[]=    str.split("[^0-9]");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(!arr[i].isEmpty())
			sum=sum+Integer.parseInt(arr[i]);
			
		}

	System.out.println(sum);

	}

}

