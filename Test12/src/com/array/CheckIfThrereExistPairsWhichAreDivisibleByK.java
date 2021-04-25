package com.array;

import java.util.HashMap;

public class CheckIfThrereExistPairsWhichAreDivisibleByK {

	public static boolean checkPairDivsibility(int a[], int k) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			int rem = a[i] % k;
			if (map.containsKey(rem)) {
				map.put(rem, map.get(rem) + 1);
			}

			else {
				map.put(rem, 1);
			}
		}

		System.out.println(map);
		for (int i = 0; i < a.length; i++) {
			int rem = a[i] % k;

			if (rem == 0) {
				int freq = map.get(rem);

				if (freq % 2 == 1) {
					return false;
				}

			}

			else if (2 * rem == k) {
				int freq = map.get(rem);
				if (freq % 2 == 1) {
					return false;
				}
			}

			else {
				int freq = map.get(rem);
				int ofreq = map.getOrDefault(k - rem, 0);

				if (freq != ofreq) {
					return false;
				}
			}

		}
		return true;

	}

	public static void main(String[] args) {

		int arr[] = { 25, 5, 70, 10, 36, 44, };

		int k = 5;
		boolean ans = checkPairDivsibility(arr, k);
		System.out.println(ans);
	}

}
