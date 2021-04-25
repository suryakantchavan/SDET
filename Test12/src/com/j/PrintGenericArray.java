package com.j;

public class PrintGenericArray {
	
	
	public static<T> void printArray(T a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		} 
	}
	
	
	public static void main(String[] args) {
		
		Character a[] = new Character[26];
		
		for(int i=0;i<26;i++)
		{
			a[i]=(char) ('a'+i);
		}
		
		
		printArray(a);
	}

}
