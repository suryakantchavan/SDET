package com.design.pattern;

public class Addition implements Strategy{

	@Override
	public int doCalculation(int a, int b) {
	
		return a+b;
		
	}

}
