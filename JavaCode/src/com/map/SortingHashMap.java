package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingHashMap {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");

		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.println(entry.getValue() + " "+ entry.getKey());
		}
		System.out.println();
		
		Map<String, String> treeset = new TreeMap<>(map);
		for(Map.Entry<String, String> entryTree : treeset.entrySet()) {
			System.out.println(entryTree.getKey()+ ""+ entryTree.getValue());
		}
		
	}

}
