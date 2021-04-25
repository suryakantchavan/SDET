package com.j;

import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int count = 0;
		try
		{

		System.out.println("please enter position to split the array");
		Scanner sc = new Scanner(System.in);
		
		int pos = sc.nextInt();

		if (pos > arr.length || pos < 0) {
			System.out.println("invald position please enter the correct one ");

			
			return;
		}

		int a[] = new int[pos];

		int b[] = new int[arr.length - pos];

		for (int i = 0; i < arr.length; i++) {

			if (i < pos) {
				a[i] = arr[i];
			}

			else {

				b[count] = arr[i];
				count++;

			}
		}

		// printing of the array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		}
		
		catch(Exception e) {
		System.out.println("please enter proper input it should be digit only");
		}
	}

}
