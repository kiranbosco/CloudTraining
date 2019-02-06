package com.sortedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {

	public void mapObject() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "kiran");
		map.put("company", "cfx");

		for(Map.Entry<String, String> entry :map.entrySet());
		for(Entry<String, String>  entry :map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " "+ val);
		}

	}
	
}
