package com.tony.java8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithLambda {

	public static void main(String args[]) {
		
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(20);
		l.add(12);
		l.add(7);
		l.add(100);
		
		Collections.sort(l);
		
		System.out.println("After Sorting ===>"+l);
		
		Collections.sort(l,(O1,I2)->(O1>I2)?-1:(O1<I2)?+1:0);
		
		System.out.println("After Sorting with Lambda===>"+l);
		
		
	}
}
