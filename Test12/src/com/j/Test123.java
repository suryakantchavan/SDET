package com.j;

public class Test123 {

	public static void main(String[] args) {

		String s = "dads56wq56asd6a!!!4dw100";
		String r = s.replaceAll("[^0-9]", " ");
		String m[] = r.split(" ");
		int sum = 0;

		for (int i = 0; i < m.length; i++) {

			try {

				int a = Integer.parseInt(m[i]);
				sum = sum + a;

			}

			catch (NumberFormatException e) {

			}
		}

		System.out.println(sum);
	}

}
