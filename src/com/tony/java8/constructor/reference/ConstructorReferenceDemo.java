package com.tony.java8.constructor.reference;

public class ConstructorReferenceDemo {

	
	public static void main(String args[]) {
		
		Interf f=Sample::new;
		
		Sample s=f.get();
		
		
	}
}
