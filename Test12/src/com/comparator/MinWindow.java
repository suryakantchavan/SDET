package com.comparator;

public class MinWindow {
	public static String findMinWin(String str, String ptr) {

		int str_len = str.length();
		int ptr_len = ptr.length();

		int ascii_str[] = new int[256];
		int ascii_ptr[] = new int[256];

		for (int i = 0; i < ptr_len; i++) {
			ascii_ptr[ptr.charAt(i)]++;
			}
		
		int start=0;
		int start_index=-1;
		int min_win=Integer.MAX_VALUE;
		int count=0;
		for(int j=0;j<str_len;j++)
		{
			ascii_str[str.charAt(j)]++;
			
			if(ascii_str[str.charAt(j)] <= ascii_ptr[str.charAt(j)] && ascii_ptr[str.charAt(j)]!=0) {
				count++;
			}
			
		
			if(count==ptr_len)
			{
				//while loop to reduce window size with two conditins
				while(ascii_str[str.charAt(start)]>ascii_ptr[str.charAt(start)] || ascii_ptr[str.charAt(start)]==0)
				{
					if(ascii_str[str.charAt(start)]>ascii_ptr[str.charAt(start)])
					{
						ascii_str[str.charAt(start)]--;
					}
					
					start++;
				}
				
				int win_len=j-start+1;
				if(min_win>win_len)
				{
					min_win=win_len;
					start_index=start;
				}
				
			}
			
		}
		

		return str.substring(start_index, start_index+min_win);
	}

	public static void main(String[] args) {

		String str = "ADOBECODEBANC";

		String ptr = "ABC";
		String ans = findMinWin(str, ptr);

		System.out.println(ans);

	}
}
