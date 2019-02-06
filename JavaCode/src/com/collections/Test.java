package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer ,String> m = new HashMap<>();
		
		m.put(1, "k");
		m.put(2, "s");
		m.put(3, "t");
		
		m.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
			
		m.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	for(Entry<Integer, String> entry :m.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());	
	}
		
//System.out.println(m);		

String r =(String)m.putIfAbsent(4, "All"); // this method is the 
System.out.println( m);

 }
}
