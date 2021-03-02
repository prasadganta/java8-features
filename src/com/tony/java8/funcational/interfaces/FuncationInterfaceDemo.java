package com.tony.java8.funcational.interfaces;

import java.util.function.Function;

public class FuncationInterfaceDemo {
	
	public static void main(String args[]) {
		
		String s="Prasad Ganta";
		Function<String,String> f=a->a.replaceAll(" ", "");
		
		System.out.println("length of the String ...!"+f.apply(s));
		
		
		
		
	}

}
