package com.comparator;

import java.util.Scanner;


public class TwoDAraryd {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of row");
		int row=sc.nextInt();
		System.out.println("enter no of col");
		int col=sc.nextInt();
		
		int a[][]= new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
			System.out.println();
		}
		
		System.out.println(sum);
		
		 int numberOfColumns = a.length;
		    int numberOfRows = a[0].length;
		    
		    System.out.println(numberOfColumns);

		    System.out.println(numberOfRows);
		    
	}

	
}
