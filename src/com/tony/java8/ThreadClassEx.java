package com.tony.java8;

public class ThreadClassEx {
	
	public static void main(String args[]) {
		
		
		Thread t=new Thread(()->{
			for(int i=0; i<10; i++) {
				  System.out.println("Child Thread");
				 }
			
		});
		
		t.start();
		
		for(int i=0; i<10; i++) {
			  System.out.println("New  Thread");
			 }
	}
	

}
