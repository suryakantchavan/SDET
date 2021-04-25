package com.learning.inheritance;

//filename: Main.java
class Base1 {
	Base1() {
		System.out.println("Base Class Constructor Called ");
	}
}

class Derived extends Base1 {
	Derived() {
		System.out.println("Derived Class Constructor Called ");
	}
}

public class Base {

	public static void main(String[] args) {
		Derived d = new Derived();
	}

}
