package com.array;

public class NextGreastEle {

	public static void main(String[] args) {
		int a[] = { 3, 4, 20, 6, 15, 2, 1, 7 };

		int n = a.length;

		int max_fright = a[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (a[i] < max_fright) {
				a[i] = max_fright;
			} else {
				max_fright = a[i];
			}
		}
		
		

	}
	
	
	

}
