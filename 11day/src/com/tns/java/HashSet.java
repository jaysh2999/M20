//Demo on HashSet
package com.tns.java;

import java.util.*;

class HashSetDemo {
	public static void main(String args[]) {
		// create a hash set
		HashSet<String> hs = new HashSet<String>();
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		
		//Duplicate elements not allowed
		hs.add("B");
		hs.add("A");
		
		
		hs.add(null);
		System.out.println(hs);
		
		hs.remove("E");
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
	}
}
