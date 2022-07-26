package com.tns.java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String []args) {
		ArrayList l=new ArrayList();//Growable in nature
		l.add("A");
		l.add(1000);
		l.add(4.5);
		l.add(null);
		l.remove(2);
		
		
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
		
	}
}
