package com.array;

public class MaxContiouSum {

	public static void main(String[] args) {

		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	public static int maxSubArraySum(int a[])

	{
		int sum_so_far = 0;
		
		int start=0;
		int end=0;
		int s=0;

		int max_sum_so_far = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {

			sum_so_far = sum_so_far + a[i];

			if (max_sum_so_far < sum_so_far) {
				max_sum_so_far = sum_so_far;
				start=s;
				end=i;
			}

			if (sum_so_far < 0) {
				sum_so_far = 0;
				s=i+1;
			}

		}

		
		System.out.println(start);
		System.out.println(end);
		return max_sum_so_far;

	}
}
