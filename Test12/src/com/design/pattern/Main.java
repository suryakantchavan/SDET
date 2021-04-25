package com.design.pattern;

public class Main {
	
	public static void main(String[] args) {
		Context c = new Context(new Multiplication());
		
		System.out.println(c.excuteStrategy(5, 5));
	}

}
