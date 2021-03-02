package com.tony.java8.funcational.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateFunctionalInterDemo {
	
	public static void main(String args[]) {
		Predicate<Integer> p=I->I>10;
		
		System.out.println(p.test(1));
		
		Predicate<String> s=I->I.startsWith("t");
		
		System.out.println(" Name startes with t:="+s.test("tony"));
		
		
		ArrayList<String> l=new ArrayList<String>();
		
		l.add("prasad");
		l.add("lucky");
		l.add("cham");
		
		Predicate<ArrayList> al=I->I.contains("chamu");
		
		System.out.println("Chekcing ArrayList is contains lucky ? "+al.test(l));
		
		
		
		
		
		
	}

}
