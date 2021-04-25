package NewString;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args) {
		
		String s="abcabdeanck";
		int start=0;
		int end=0;
		int maxLen=0;
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		while(end<s.length())
		{
			char currentChar=s.charAt(end);
			if(map.containsKey(currentChar))
			{
				start=Math.max(start, map.get(currentChar)+1);
			}
			
			map.put(currentChar, end);
			
			maxLen=Math.max(end-start+1, maxLen);
			end++;
			
			
		}
		System.out.println(maxLen);
		
	}

}
