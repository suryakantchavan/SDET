package com.array;

public class Sort0and1and2 {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 1, 0, 2, 1, 1, 2, 0, 1, 0, 0 };

		int low = 0;
		int high = arr.length - 1;
		int mid = 0;

		while (mid <= high) {
			if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;

				high--;
			}

			else if (arr[mid] == 1) {

				mid++;

			}

			else {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
