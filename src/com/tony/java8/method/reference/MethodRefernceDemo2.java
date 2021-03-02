package com.tony.java8.method.reference;

public class MethodRefernceDemo2 {
	
	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Inside the child thread"+i);
		}
	}
	
	
	public static void main(String args[]) {
		
		MethodRefernceDemo2 demo=new MethodRefernceDemo2();
		
		Runnable r=demo::m1;
		
		Thread t=new Thread(r);
		
		t.start();
		
		
		System.out.println("Inside the main thread");
		
	}

}
