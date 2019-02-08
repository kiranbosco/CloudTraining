package com.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDuplicateValues {
	
	public void duplicateObject() {
		
		Map<Integer,String> hs = new HashMap<>();
		hs.put(1, "kiran");
		hs.put(1, "vijay");
		hs.put(2, "kiran");
		hs.put(3, "charan");
		
		Set<Object> set = new HashSet<>(hs.values());
		System.out.println(set);
		
		for(Map.Entry<Integer, String> entry : hs.entrySet()) {
			
			System.out.println(entry.getValue());
		}
	}
	
	

	public static void main(String[] args) {
		
		HashMapDuplicateValues h = new HashMapDuplicateValues();
		h.duplicateObject();
	}
}