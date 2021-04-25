package com.array;

import java.util.HashSet;

public class SmallestPostiveMissingNumber {

	public static void main(String[] args) {

		int arr[] = { 0, -10, 1, 2, -20 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 1; i <= arr.length + 1; i++) {
			if (set.contains(i)) {
				continue;
			}

			else {
				System.out.println(i);
				break;
			}
		}
	}

}
