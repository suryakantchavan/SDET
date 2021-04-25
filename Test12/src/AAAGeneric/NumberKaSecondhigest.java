package AAAGeneric;

public class NumberKaSecondhigest {

	public static void main(String[] args) {

		int n = 123789;
		int temp = n;

		int firstmax = Integer.MIN_VALUE;

		int secondmax = Integer.MIN_VALUE;

		while (temp > 0) {
			int rem = temp % 10;
			if (rem > firstmax) {
				firstmax = rem;
			}
			temp = temp / 10;
		}

		while (n > 0) {
			int rem = n % 10;
			if (rem > secondmax && rem != firstmax) {
				secondmax = rem;
			}
			n = n / 10;
		}

		System.out.println(secondmax);

	}

}
