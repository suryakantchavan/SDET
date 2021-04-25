package com.array;

public class FindNumberOf2inGivenNum {

	public static void main(String[] args) {
		long n =30;
		long count = 0;

		for (int i = 2; i <= n; i++) {
			String s = Integer.toString(i);
			if (s.contains("2")) {
				long num = Integer.parseInt(s);

				while (num > 0) {
					long rem = num % 10;
					if (rem == 2) {
						count++;
					}
					num = num / 10;
				}
			}

		}

		System.out.println(count);
	}
}
