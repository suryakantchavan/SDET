package com.array;

public class NextGretaseEle {
	
	public static void main(String[] args) {
	
		int a[]= {3,4,20,6,15,2,1,7};
		
		int max=Integer.MIN_VALUE;
		int count=0;
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=index;j<a.length;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
					count++;
				}
			}
			
			while(count>0)
			{
				a[index]=max;
				index++;
				count--;
			}
			max=Integer.MIN_VALUE;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
