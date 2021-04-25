package com.design.pattern;

public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy)
	{
		this.strategy=strategy;
	}
	
	public int excuteStrategy(int a , int b)
	{
		return strategy.doCalculation(a, b);
	}

}
