package com.tony.java8;

public class RunnableExample {

	
	public static void main(String args[]) {
		
		Runnable r=()->{
			for(int i=0;i<=9;i++) {
				System.out.println("Chila Thread !!---"+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<=9;i++) {
			System.out.println("Main Thread !!---"+i);
		}
	}
	
	
	
}
