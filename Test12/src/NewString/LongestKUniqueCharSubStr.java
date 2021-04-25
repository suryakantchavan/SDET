package NewString;

public class LongestKUniqueCharSubStr {
	
	public static void main(String[] args) {
		
		
		String s="aabacbebebe";
		for(int i=0;i<s.length();i++)
		{
			s=s.substring(1);
			System.out.println(s);
		}
	}

}
