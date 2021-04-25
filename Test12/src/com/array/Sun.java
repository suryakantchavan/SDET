package com.array;

public class Sun {

	
	public static void main(String[] args)  {
		
		try {
			
			int a=5/0;
			System.out.println(a);
			
			System.out.println("hi");
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		///exception is thrown most specific to most genric 
		//if we throw from most generic to most sepcfic it will throw compile time error 
	}
}
