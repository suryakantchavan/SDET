package com.array;

import java.util.ArrayList;
import java.util.HashMap;

public class GenerateArray {

	public static boolean check1areKdistanceApart(int nums[], int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(i, nums[i]);
		}

		ArrayList<Integer> l = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get(i) == 1) {
				l.add(i);
			}
		}
		
	

		for (int i = 0; i < l.size() - 1; i++) {
			int index=l.get(i + 1) - l.get(i);
			System.out.println(index);
			if(index<=k)
			{
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		int nums[] = {1,1,1,1,1};

		int k = 0;

		boolean ans = check1areKdistanceApart(nums, k);

		System.out.println(ans);

	}

}
