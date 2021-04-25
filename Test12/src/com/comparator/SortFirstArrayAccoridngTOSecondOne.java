package com.comparator;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortFirstArrayAccoridngTOSecondOne {

	public static void relativeSort(int first[], int second[]) {

		TreeMap<Integer, Integer> freq = new TreeMap<>();

		for (Integer i : first) {
			freq.put(i, freq.getOrDefault(i, 0) + 1);
		}
	

		int index = 0;
		for (Integer i : second) {
			if (freq.get(i) != null) {
				int n = freq.get(i);
				while (n > 0) {
					first[index++] = i;
					n--;
				}

				freq.remove(i);
			}

		}

		for (Entry<Integer, Integer> entery : freq.entrySet()) {
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
