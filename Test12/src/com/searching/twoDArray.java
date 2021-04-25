package com.searching;

public class twoDArray {

	public static void main(String[] args) {

		int a[][] = { { 1, 10, 4 }, { 9, 3, 8 }, { 15, 16, 17 } };

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			min = Integer.MAX_VALUE;

			for (int j = 0; j < a[0].length; j++) {
				min = Math.min(min, a[i][j]);
			}

		}
		
		System.out.println(min);
	}

}
