package com.j;

public class Pattern {
	
	
	public static void main(String[] args) {
		int n=4;

		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<2*n+1;j++)
			{
				if(j==n-1)
				{
					System.err.print("*");
				}
				
				else
				{
					System.out.print("0");
				}
			}
			
			System.out.println();
		}
	}

}
