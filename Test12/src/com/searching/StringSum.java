package com.searching;

public class StringSum {

	public static void main(String[] args) {

		String str = "sd12mdks12sm12";

		int sum = 0;
		
		String temp="0";
		

		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))
			{
				temp=temp+str.charAt(i);
			}
			
			else
			{
				sum=sum+Integer.parseInt(temp);
				temp="0";
			}

		}

		
		System.out.println(sum+Integer.parseInt(temp));
	}

}
