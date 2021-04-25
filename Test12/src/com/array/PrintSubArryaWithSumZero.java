package com.array;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintSubArryaWithSumZero {

	public static ArrayList<Pair> findSubArray(int arr[], int n) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Pair> out = new ArrayList<>();

		int sum = 0;
		

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			if (sum == 0) {
				out.add(new Pair(0, i));
			}
			ArrayList<Integer> al = new ArrayList<>();
			
			

			if (map.containsKey(sum)) {
				al = map.get(sum);
				System.out.println(al);
				System.out.println("size is" +al.size());

				for (int j = 0; j < al.size(); j++) {
					out.add(new Pair(al.get(j) + 1, i));
				}

			}

			al.add(i);
			System.out.println(al);
			map.put(sum, al);
			System.out.println(map);
			
			

		}

	
		return out;

	}
	
	public static void print(ArrayList<Pair> out, int arr[])
	{
		
		for(int i=0;i<out.size();i++)
		{
			Pair p= out.get(i);
			
		
			for(int j=p.first;j<=p.second;j++)
			{
				System.out.print(arr[j]+" ");
			}
				
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 2, -3, 1, 6 };
		int n = arr.length;

		ArrayList<Pair> out = findSubArray(arr, n);

		if (out.size() == 0) {
			System.out.println("no subaary eixts");
		} else
			print(out,arr);

	}
}
