package com.array;

public class LongestPalendromicSubStr {

	public static void lPsubStr(String str) {

		int max_len = 0;
		int start = 0;
		
		  if(str.length()==1)
	        {
	           System.out.println(str);
	        }
	        
	        if(str.length()==2 && str.charAt(0)!=str.charAt(1))
	        {
	           System.out.println(str.charAt(0)+"");
	        }
		for (int i = 1; i < str.length(); i++) {

			int low = i - 1;
			int high = i;

			while ((low >= 0 && high < str.length()) && str.charAt(low) == str.charAt(high)) {
				if (max_len < high - low + 1) {
					max_len = high - low + 1;
					start = low;
				}

				low--;
				high++;

			}

			low = i - 1;
			high = i + 1;

			while ((low >= 0 && high < str.length()) && str.charAt(low) == str.charAt(high)) {
				if (max_len < high - low + 1) {
					max_len = high - low + 1;
					start = low;
				}

				low--;
				high++;

			}

		}
		
		if(start==0 && max_len==0)
		{
			System.out.println(str.charAt(0)+"");
		}
		System.out.println(str.substring(start, start + max_len));
	}

	public static void main(String[] args) {

		String str = "abcda";

		lPsubStr(str);
	}

}
