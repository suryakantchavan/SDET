package com.comparator;

import java.util.Arrays;

public class SortFirstArrayAccordingtoSecondOne {

	public static void main(String[] args) {

		int first[] = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 1, 8, 4 };
		Arrays.sort(first);

		int second[] = { 3, 5, 7, 2 };

		int newFirst[] = new int[first.length];

		// 1,1,3,3,3,4,4,5,5,7,8,8,9,9

		int count = 0;

		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < first.length; j++) {
				if (first[j] == second[i]) {
					newFirst[count] = second[i];
					first[j] = -1;
					count++;
				}
			}

		}

		for (int i = 0; i < first.length; i++) {
			if (first[i] != -1) {
				newFirst[count] = first[i];
				count++;
			}
		}

		for (int k = 0; k < newFirst.length; k++) {
			System.out.print(newFirst[k] + " ");
		}

	}

}
