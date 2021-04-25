package com.comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class secondHigest {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = bf.readLine().split(" ");

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) > firstMax) {
				firstMax = Integer.parseInt(arr[i]);
			}
		}

		System.out.println(firstMax);

		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) != firstMax) {

				if (Integer.parseInt(arr[i]) > secondMax) {
					secondMax = Integer.parseInt(arr[i]);
				}
			}
		}
		
		System.out.println(secondMax);
	}

}
