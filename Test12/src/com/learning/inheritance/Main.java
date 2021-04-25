package com.learning.inheritance;

public class Main {

	public static void main(String[] args) {

		Child p = new Child("surya");// for this class only parent class parmaterized constructor will be called it's
										// own no-args construtor won't be called

		Child c = new Child("Ram", 10);/// for this child class it is calling parameterized constructor of it's own so
										/// before calling own constror it will class parent one as well

		// Parent p1 = new Parent("from parent");
		c.sleep();
		p.sleep();
		// p1.sleep();
	}

}
