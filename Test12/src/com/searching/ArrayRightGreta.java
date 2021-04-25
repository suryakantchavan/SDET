package com.searching;

public class ArrayRightGreta {

	public static void Print() {

	}

	public static void main(String[] args) {

		int a[] = {22,55,100,65,56,86,46,15,96,83 };

		
		
	int min=Integer.MIN_VALUE;
		
		for(int k=a.length-1;k>=0;k--)
		{
			if(a[k]>min)
			{
				min=a[k];
				System.out.println(a[k]);
			}
		}

	}

}
