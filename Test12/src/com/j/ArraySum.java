package com.j;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 6, 4,9, 1, 7 };

		int a = 6;
		int b = 9;
		int sum = 0;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != a && flag) {
				
				sum=sum+arr[i];
			}

			
			else if(arr[i]==a)
			  flag=false;
			
			else if(arr[i]==b)
				flag=true;
		}
		
		
		System.out.println(sum);
		
	}

}