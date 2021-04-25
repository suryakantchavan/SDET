package com.comparator;

public class Question1 {

	public float sum(float a, float b) {
		System.out.println(a + b);
		return b;
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Question1 a = new Question1();
		a.sum(10, 12);

	}

}
