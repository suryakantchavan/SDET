package KakaShree;

import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		
		
		B b= new B(6);
		
		
		String s="hello";
		
		String s2="hello";
		
		System.out.println(s==s2);
		
		
		IntStream.rangeClosed(0, 100).mapToObj(
		        i -> i % 3 == 0 ?
		                (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
		                (i % 5 == 0 ? "Buzz" : i))
		        .forEach(System.out::println);
	}

}
