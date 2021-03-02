package com.tony.java8;

public class JavaHello {
	

	public static void main(String args[]) {
		
		Greetings greet=n->System.out.println("Welcome to Java 8  "+n);
		
		greet.sayHello("Tony");
		
		
		Addition addition=(a,b)->System.out.println(a+b);
		
		addition.addition(1, 3);
		
		
		
		
		Square s1=a->a*a;
		
		System.out.println(s1.saquare(10));
	}

}
