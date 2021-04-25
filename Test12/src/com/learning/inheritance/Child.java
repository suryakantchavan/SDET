package com.learning.inheritance;

public class Child extends Parent {

	String name;
	int age;

	public Child(String name) {
		super(name);
	}

	public Child(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name and age are " + name + " and " + age);

	}

	public Child() {
		System.out.println("child no args cons--");
	}

	
	public void sleep()
	{
		
	}

}
