package com.searching;

public class StringDigitSum {

	public static void main(String[] args) {
		String s = "sr12te12tr12";

		String temp = "0";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				temp = temp + s.charAt(i);
			}

			else if(!Character.isDigit(s.charAt(i)))
			{
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}

		

		}

		System.out.println(sum + Integer.parseInt(temp));
	}

}
