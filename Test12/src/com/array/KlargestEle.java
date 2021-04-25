package com.array;

public class KlargestEle {

	public static void merge(int s1[], int s2[], int d[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < s1.length && j < s2.length) {
			if (s1[i] < s2[j]) {
				d[k] = s1[i];
				k++;
				i++;
			}

			else {
				d[k] = s2[j];
				j++;
				k++;
			}

		}

		while (i < s1.length) {
			d[k] = s1[i];
			k++;
			i++;

		}
		while (j < s2.length) {
			d[k] = s2[j];
			j++;
			k++;
		}
	}

	public static void megreSort(int a[]) {
		int b[] = new int[a.length / 2];
		int c[] = new int[a.length - b.length];

		if (a.length <= 1) {
			return;
		}
		// copy element
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}

		for (int j = c.length; j > 0; j--) {
			c[c.length - j] = a[a.length - j];
		}

		megreSort(b);
		megreSort(c);

		merge(b, c, a);

	}

	public static void main(String[] args) {

		int arr[] = { 1, 23, 12, 9, 30, 2, 50 };
		int k = 5;
			
		// Arrays.sort(arr);
		megreSort(arr);

		int count = arr.length - 1;
		while (k > 0) {
			System.out.println(arr[count]);
			count--;
			k--;
		}

	}

}
