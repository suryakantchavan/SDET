package com.array;

import java.util.TreeMap;
import java.util.Map.Entry;

public class RelativeSorting {

	public static void relativeSort(int first[], int second[]) {
		TreeMap<Integer, Integer> map = new TreeMap<>();

		for (Integer i : first) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		int index = 0;

		for (Integer i : second) {
			if (map.get(i) != null) {
				int count = map.get(i);
				while (count > 0) {
					first[index++] = i;
					count--;
				}

				map.remove(i);

			}

		}

		for (Entry<Integer, Integer> entery : map.entrySet()) {
			int count = entery.getValue();
			while (count > 0) {
				first[index++] = entery.getKey();
				count--;
			}
		}
	}

	public static void main(String[] args) {

		int first[] = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 1, 8, 4 };

		int second[] = { 3, 5, 7, 2 };

		relativeSort(first, second);

		for (int i = 0; i < first.length; i++) {
			System.out.print(first[i] + " ");
		}
	}

}
