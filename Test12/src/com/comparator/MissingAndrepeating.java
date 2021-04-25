package com.comparator;

import java.util.HashMap;

public class MissingAndrepeating {

	public static int findKthPositive(int[] arr, int k) {

		int count = 0;
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (Integer i : arr) {

			if (map.get(i) == null) {

				map.put(i, true);

			} else {
				System.out.println("repeating is " + i);
			}
		}

		System.out.println(map);
		for (int i = 1; i <= arr.length + k; i++) {

			if (map.get(i) == null) {
				count++;
				if (count == k) {
						
					return i;
				}

			}
		}

		return 0;

	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 7, 11 };

		int k = 20;

		int ans = findKthPositive(arr, k);
		System.out.println(ans);

	}
}
