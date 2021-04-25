package com.j;

public class IsSubSeq {
	
	public static boolean isSubSequence(String str1, String str2,int m , int n)
	{
		if(m==0)
		{
			return true;
		}
		
		if(n==0)
		{
			return false;
		}
		
		
		if(str1.charAt(m-1)==str2.charAt(n-1))
		{
			return isSubSequence(str1, str2, m-1, n-1);
		}
		
		else
			return isSubSequence(str1, str2, m, n-1);
		
		
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str1="AYXT";
		String str2="ADYCPX";
		
		int m=str1.length();
		int n=str2.length();
		
		boolean res= isSubSequence(str1, str2, m, n);
		
		if(res)
		{
			System.out.println("yes");
		}
		
		else
		{
			System.out.println("no");
		}
		
	}

}
