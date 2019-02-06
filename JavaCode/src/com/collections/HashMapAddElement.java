package com.collections;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class HashMapAddElement {
	
	public static void main(String[] args) {
		 
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "cfx");
		map.put(2, null);
		map.put(3, null);
		map.put(4, "kiran");
		map.put(null,"charan");
		map.put(null, "varshini");
		map.put(null, "Heemaja");  //map can be allow only one null value if ur add the secound null value it compare the first element to store the 

		
		System.out.println();
				String s =map.get(4);
				
				System.out.println(s);
				System.out.println(map);

				/*	
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
			
			
			HashMap<Integer,String> m = new HashMap<>();
			m.put(5, "charan");
			m.putAll(map);
			
		for(Map.Entry<Integer, String> e : m.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue());
		}

		}	*/
		}

	private static PrintStream println() {
		// TODO Auto-generated method stub
		return null;
	}
	}

