package NewString;

public class ReduceString {

	public static void main(String[] args) {

		String s = "suryakant";

		int stop = s.length() / 2;

		int count = 0;
		int len = s.length();

		while (len != stop) {
			s = s.substring(0, len - count);

			System.out.println(s);
			s = s.substring(1);
			System.out.println(s);
			len--;
			count++;

		}

	}

}
