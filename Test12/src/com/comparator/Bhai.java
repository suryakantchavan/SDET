package com.comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bhai {

	public static int findAgeDiff(int[] input) {

		Arrays.sort(input);
		return input[input.length - 1] - input[0];

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		System.out.println(line);

		String[] arr = line.split(" ");
		int numberArr[] = new int[arr.length];
		for (int index = 0; index < numberArr.length; index++) {
			numberArr[index] = Integer.parseInt(arr[index]);
		}

		int op = findAgeDiff(numberArr);
		System.out.println(op);

	}
}
