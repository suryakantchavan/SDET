package com.searching;

public class BinaraySearch {

	public static int binaraySearch(int a[], int key, int low, int high) {
		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (key == a[mid]) {
			return mid;
		}

		else if (key < a[mid]) {
			return binaraySearch(a, key, low, mid-1);
		}

		else {
			return binaraySearch(a, key, mid+1, high);
		}

	}

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 8;
		int low = 0;
		int high = a.length - 1;
	int ans=binaraySearch(a, key, low, high);
	System.out.println(ans);

	}

}
