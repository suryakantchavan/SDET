package Strings;

public class StringDigitSumWithTemp {

	public static void main(String[] args) {
		String s = "kn2sadn5dasjd5";

		String temp = "0";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				temp = temp + s.charAt(i);
			}

			else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}

		System.out.println(sum + Integer.parseInt(temp));
	}

}
