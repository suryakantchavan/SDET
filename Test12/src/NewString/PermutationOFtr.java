package NewString;

public class PermutationOFtr {

	public static void findPermu(String s, int start, int end) {

		if (start == end) {
			System.out.println(s);
		}

		else {
			for (int i = start; i<=end; i++) {
				s = swap(s, start, i);
				findPermu(s, start + 1, end);
				s = swap(s, start, i);

			}
		}
	}

	public static String swap(String s, int start, int i) {
		char arr[] = s.toCharArray();

		char temp = arr[start];
		arr[start] = arr[i];
		arr[i] = temp;

		return new String(arr);

	}

	public static void main(String[] args) {

		String s = "ABC";

		findPermu(s, 0, s.length()-1);
	}

}
