package com.tony.java8.method.reference;

public class MethodReferenceDemo  {
	
	public MethodReferenceDemo(){
		
		System.out.println("Indside constructor!");
		
	}
	
	
	public  void m2() {
		
		
		System.out.println("Indside M2 mnethod ...!");
	}
	
	public  static void m3() {
		
		
		System.out.println("Indside M3 mnethod ...!");
	}

	public static void main(String args[]) {
		
		MethodReferenceDemo demo=new MethodReferenceDemo();
		
		Myinterface myInter=demo::m2;
		myInter.m1();
		
		
		Myinterface myInter2=MethodReferenceDemo::m3;
		myInter2.m1();
	}

}
