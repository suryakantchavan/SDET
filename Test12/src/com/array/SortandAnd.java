package com.array;

public class SortandAnd {

	public static void main(String[] args) {

		int a[] = { 1, 2, 0, 1, 2, 0, 2, 0, 1, 2, 0, 1 };

		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (mid <= high) {

			if (a[mid] == 2) {
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;

			} else if (a[mid] == 0) {
				int temp = a[mid];
				a[mid] = a[low];
				a[low] = temp;
				low++;
				mid++;
			}

			else {
				mid++;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
