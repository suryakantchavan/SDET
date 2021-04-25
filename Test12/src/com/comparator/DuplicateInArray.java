package com.comparator;

import java.util.Arrays;

public class DuplicateInArray {

	public static void main(String[] args) {

		int a[]= {5, 3, 0, 7, 4};
		
		Arrays.sort(a);
		
		int num1=0;
		int num2=0;
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				num1=num1*10+a[i];
			}
			else
			{
				num2=num2*10+a[i];
			}
		}
		
		sum=num1+num2;
		System.out.println(sum);
		
	}
}


