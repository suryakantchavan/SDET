package com.searching;

import java.util.Scanner;

public class CustomException {
	
	
	public static void main(String[] args) throws Age {
		
		int age;
		
		
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		
		if(age<18)
		{
			throw new Age("age is less than 18");
		}
	}

	
	
}
