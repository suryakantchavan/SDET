package com.j;

public class BinarySearch {

	public static int binarySearch(int a[], int key, int low, int high) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

		if (a[mid] == key) {
			return mid;

		}

		else if (a[mid] < key) {
			return binarySearch(a, key, mid + 1, high);
		} else {
			return binarySearch(a, key, low, mid - 1);
		}

	}

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 5, 6, 7, 9 };

		int low = 0;
		int high = a.length - 1;

		int key = 10;
		int pos = binarySearch(a, key, low, high);
		System.out.println(pos);

	}
}