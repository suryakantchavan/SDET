package Strings;

public class LongestPalenSubStr {
	
	
	public static void findLongestPalenSubStr(String s)
	{
		int max_len=0;
		int start = 0;
		
		for(int i=1;i<s.length();i++)
		{
			
			int low=i-1;
			int high=i;
			
			while((low>=0 && high<s.length()) && s.charAt(low)==s.charAt(high))
			{
				if(max_len<high-low+1)
				{
					max_len=high-low+1;
					start=low;
				}
				low--;
				high++;
			}
			
			
			low=i-1;
			high=i+1;
			while((low>=0 && high<s.length()) && s.charAt(low)==s.charAt(high))
			{
				if(max_len<high-low+1)
				{
					max_len=high-low+1;
					start=low;
				}
				
				low--;
				high++;
			}
			
		}
		
		
		System.out.println(s.substring(start, start+max_len));
		
	}
	
	
	public static void main(String[] args) {
		
		
		String s="twotoot";
		findLongestPalenSubStr(s);
	}

}
