package com.j;

import java.util.Arrays;

public class Test234d {
	
	
	public static void main(String[] args) {
		
		
		int a[]= {0,-1,-2,3,4,1,2};
		
		Arrays.sort(a);
		
		int k=1;
		
		for(int i=0;i<a.length;i++)
		{
			//-1,0,1,2,3,4
			
			if(k==a[i])
			{
				k=k+1;
			}
			
			
		}
		
		
		System.out.println(k);
	}

}
