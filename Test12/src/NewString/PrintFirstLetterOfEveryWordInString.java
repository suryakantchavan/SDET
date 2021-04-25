package NewString;

public class PrintFirstLetterOfEveryWordInString {

	public static void main(String[] args) {

		String s = "bad is good";

		String arr[] = s.split(" ");

		String newStr = "";

		for (int i = 0; i < arr.length; i++) {
			newStr = newStr + arr[i].charAt(0);
		}

		System.out.println(newStr);
	}

}
