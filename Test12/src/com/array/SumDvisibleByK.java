package com.array;

public class SumDvisibleByK {

public static void main(String[] args) {
	int arr[] = { 4, 5, 0, -2, -3, 1 };
    int k = 5;
    int count=0;
 
    for (int i=0;i<arr.length+1;i++)
    {
    	   int sum=0;
    	
    	for (int j=i;j<arr.length;j++)
    	{
    		sum=sum+arr[j];
    		if(sum%k==0)
    		{
    			count++;
    		}
    	}
    }
	
	System.out.println(count);
}

}
