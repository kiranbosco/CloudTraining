
package com.basic;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer ,String> m = new HashMap<>();
		
		m.put(1, "k");
		m.put(2, "s");
		m.put(3, "t");
		
//System.out.println(m);		

String r =(String)m.putIfAbsent(4, "All"); // this 
System.out.println( m);
 }
}