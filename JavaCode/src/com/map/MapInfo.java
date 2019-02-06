package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapInfo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Map<Integer,String> m = new HashMap<>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(null, "three");
		m.put(null, "four");

		//	m.clear(); // it is use the clear all the map elements
		boolean b =m.containsKey(2);
		System.out.println(b);
		m.get(null);

		//	m.remove(1); remove method()

		for(Map.Entry<Integer, String> entry : m.entrySet()){
			System.out.println(entry.getKey());

		}



		Set set =m.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// using map entry set

	}
}




