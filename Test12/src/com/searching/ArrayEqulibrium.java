package com.searching;

public class ArrayEqulibrium {

	public static int getEquiPoint(int arr[]) {

		if (arr.length == 0) {
			return -1;
		}
		int sum = 0;

		int sum_so_far = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
			if (sum == sum_so_far) {
				return i;
			}

			sum_so_far = sum_so_far + arr[i];
		}
		return 0;
		

	}

	public static void main(String[] args) {

		int a[] = { 1, 6, 7, 0, 7 };

		int p = getEquiPoint(a);
		if(p==0)
		{
			System.out.println("doesn't exit");
		}
		System.out.println(p);

	}
}
