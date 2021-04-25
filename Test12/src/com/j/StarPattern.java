package com.j;

public class StarPattern {

	public static void main(String[] args) {
		int row = 6;
	
		// outer loop
		for (int i = 0; i <row; i++) {
			// spaces
			for (int j = row; j >i; j--) {
				System.out.print(" ");
			}
			// printing star
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
