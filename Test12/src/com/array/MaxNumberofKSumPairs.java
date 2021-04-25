package com.array;

import java.util.HashMap;

public class MaxNumberofKSumPairs {

	public static void main(String[] args) {
		int nums[] = { 3, 5, 1, 5 };
		if (nums.length == 1) {
			return;
		}
		int k = 2;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int diff = k - nums[i];

			if (map.containsKey(diff)) {

				if (diff == k) {

					if (map.get(diff) >= 2) {
						map.put(diff, map.get(diff) - 2);
					}
				}

				else if (map.get(nums[i]) > 0 && map.get(diff) > 0) {

					map.put(nums[i], map.get(nums[i]) - 1);
					map.put(diff, map.get(diff) - 1);

					count++;

				}
			}

		}
		System.out.println(count);
	}
}