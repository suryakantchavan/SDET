package com.array;

import java.util.HashMap;

public class CountSubAaryDivisbileByK {

	public static int countSubArrayDivisbleByK(int a[], int k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int sum = 0;
		int rem = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			rem = sum % k;

			if (rem < 0) {
				rem = rem + k;
			}
			if (map.containsKey(rem)) {
				count = count + map.get(rem);
				map.put(rem, map.get(rem) + 1);
			}

			else {
				map.put(rem, 1);
			}

		}

		return count;

	}

	public static void main(String[] args) {


		int a[] = { 4, 5, 0, -2, -3, 1 };
		int k = 5;

		int ans = countSubArrayDivisbleByK(a, k);
		System.out.println(ans);
	}

}
