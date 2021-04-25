package Strings;

public class PermutationOFString {

	public static void findPerm(String s, int start, int end) {
		if (start == end) {
			System.out.println(s);
		}

		else {
			for (int index = start; index <= end; index++) {

				s = swap(s, start, index);
				findPerm(s, start + 1, end);

				s = swap(s, start, index);
			}
		}

	}

	public static String swap(String s, int start, int index) {

		char a[] = s.toCharArray();

		char temp = a[start];
		a[start] = a[index];
		a[index] = temp;

		return new String(a);

	}

	public static void main(String[] args) {

		String s = "ABC";

		findPerm(s, 0, s.length() - 1);
	}

}
