package NewString;

import java.util.ArrayList;

public class RemoveCharFromFirstStringWhichArePresentINSeconStr {

	public static void main(String[] args) {
		String s1 = "occurrence";
		String s2 = "car";

		String newSTr = "";

		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < s2.length(); i++) {
			list.add(s2.charAt(i));
		}

		for (int i = 0; i < s1.length(); i++) {

			if (list.contains(s1.charAt(i))) {
				continue;
			} else {
				newSTr = newSTr + s1.charAt(i);
			}
		}

		System.out.println(newSTr);
	}

}
