package com.comparator;

public class chekSubSeq {

	public static boolean checkSeq(String s1, String s2, int m, int n)
	{
		
		if (m==0)
		{
			return true;
		}
		
		if(n==0)
		{
			return false;
		}
		
		else if(s1.charAt(m-1)==s2.charAt(n-1))
		{
			return checkSeq(s1, s2, m-1, n-1);
		}
		
		
		else
		{
			return checkSeq(s1, s2, m, n-1);
		}
		
	
	}
	
	
	public static void main(String[] args) {

		
		
		String s1="AXY";
		
		String s2="ABADXRY";
		
	boolean b=	checkSeq(s1, s2, s1.length(), s2.length());
	
	if(b)
	{
		System.out.println("yes");
	}
		
	
	
	else
	{
		System.out.println("no");
	}

}}
