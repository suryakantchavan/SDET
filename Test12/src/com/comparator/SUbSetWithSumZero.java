package com.comparator;

public class SUbSetWithSumZero {
	
	
	public static void main(String[] args) {
		
		int arr[] ={4, 2, -3, 1, 6};
		
		
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
			
			
			if(sum==0)
			{
				System.out.println("sun aaray found form " +i+"  "+j);
			}
			}
		}
	}

}
