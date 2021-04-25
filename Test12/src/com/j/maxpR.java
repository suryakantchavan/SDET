package com.j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class maxpR {

	

	public static void main(String[] args) {

		int arr[] = { 34, 78, 90, 15,67 };
		
		Arrays.sort(arr);
		int maxProfit = 0;

		int price = 0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
				
			price=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>=price)
				{
					count++;
				}
			}
			
				
			
			maxProfit= Math.max(maxProfit, count*price);
			count=0;
			
		}

	System.out.println(maxProfit);
	}

}
