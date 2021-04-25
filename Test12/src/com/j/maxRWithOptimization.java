package com.j;

import java.util.Arrays;

public class maxRWithOptimization {

	public static void main(String[] args) {

		int arr[] = { 34, 78, 90, 15, 67 };

		Arrays.sort(arr);

		int maxProfit = 0;

		for (int i = 0; i < arr.length; i++) {

			maxProfit = Math.max(maxProfit, (arr.length - i) * arr[i]);

		}

		System.out.println(maxProfit);
	}

}
