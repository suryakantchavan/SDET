package com.comparator;
class TestKaka{
	 static int count;
	 TestKaka()
	{
		count++;
	}
	
	public void printNumber()
	{
		System.out.println(count);
	}
}

public class Question6 {
	
	
	public static void main(String[] args) {
		
		TestKaka d1= new TestKaka();
		TestKaka d2= new TestKaka();
		TestKaka d3= new TestKaka();
		d1.printNumber();
		d2.printNumber();
		d3.printNumber();
	}

}
