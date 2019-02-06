package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// hash set cant maintin the order and hashset cant allowd the duplicate the values
public class HahshSetExe {
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("one");
		s.add("two");
		s.add("two");

		s.add("three");
		s.add("four");
		s.add("five");
		
		s.remove("one"); // remove the element
		
		HashSet<String> hs = new HashSet<>();
		hs.add("six");
		hs.add("seven");
		hs.add("eight");
		hs.add("nine");
		hs.add("ten");
		s.addAll(hs); // add all method()
		s.removeAll(hs); // remove all method()
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
