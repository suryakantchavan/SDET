package com.array;

import java.util.Arrays;

public class MiniDiffPair {

	public static void main(String[] args) {

		int a[] = { 5, 8, 9, 4, -4, 6 };

		Arrays.sort(a);

		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i < a.length - 1; i++) {

			int diff = a[i + 1] - a[i];
			if (diff < min_diff) {
				min_diff = diff;
			}
		}

		System.out.println(min_diff);
	}

}
