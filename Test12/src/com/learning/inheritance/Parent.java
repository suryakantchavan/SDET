package com.learning.inheritance;

public class Parent {

	String name;

	public Parent(String name) {
		this.name = name;
		System.out.println("my name is " + name);
	}

	public Parent() {
		System.out.println("this is non-agr constructor");
	}

	private  void sleep() {
		System.out.println("sleeping ..parent");
	}

}
