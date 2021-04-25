package com.j;

public class SumRecursion {

	public static void main(String[] args) {
	
		//System.out.println(sum(4));
	//System.out.println(pow(2,3));
		
		int arr[]= {1,2,3,4,-4};
		int sum=0;
		System.out.println(arraySum(arr.length,arr));
		

	}


	
	static int sum(int n)
	{
		if(n==1)
			return 1;
		return n+sum(n-1);
		
	}
	
	static int pow(int a, int b)
	{
		if(b==0)
		return 1;
		
		return a*pow(a,b-1);
		
	}
	
	
	static int arraySum(int len, int arr[]) {
		if(len<=0)
		{
			return 0;
		}
		
		return arraySum(len-1, arr)+arr[len-1];
		
	}
}
