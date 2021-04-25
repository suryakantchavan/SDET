package com.learning.inheritance;

class A {
	public A() {
		System.out.println("line1");
	}

	public void a() {
		System.out.println("line2");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("line3");
	}
	
	
	public void b()
	{
		System.out.println("line4");
	}
	
}


class C extends B{
	
	public C()
	{
		System.out.println("line5");
	}
	
	
	public void c()
	{
		System.out.println("line6");
	}
}


public class Question10 {

	public static void main(String[] args) {
		
		B b= new C();
		b.a();

	}

}
