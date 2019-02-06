package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//if u want to sorting in ur map class u should be conver the map to treemap in java

public class MapSorting {
	
	public static void main(String[] args) {
		
		Map<Integer ,String> map= new HashMap<>();
		map.put(8, "kiran");
		map.put(6, "vijay");
		map.put(3, "charan");
		map.put(10, "joseph");
		map.put(2, "bosco");
		map.put(3, "charan");
		map.put(8, "kiran");

Map<Integer, String> tree = new TreeMap(map);	
for(Map.Entry<Integer, String> entry : map.entrySet()) {
	Integer key =entry.getKey();
	String val = entry.getValue();
	System.out.println(key + " "+ val);
}


	}

}
