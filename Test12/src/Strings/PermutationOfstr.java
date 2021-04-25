package Strings;

public class PermutationOfstr {

	public static void findPerm(String s, int start, int end) {
		if (start == end) {
			System.out.println(s);
		} else {

			for (int i = start; i <= end; i++) {
				s = swap(s, start, i);
				findPerm(s, start + 1, end);
				s = swap(s, start, i);
			}
		}

	}

	public static String swap(String s, int start, int i) {

		char a[] = s.toCharArray();
		char temp = a[start];
		a[start] = a[i];
		a[i] = temp;

		return new String(a);

	}

	public static void main(String[] args) {

		String s = "eidbaooo";

		findPerm(s, 0, s.length() - 1);
	}

}
