package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapTesting {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "kiran");
		hs.put(2, "sujatha");
		hs.put(3, "vijay");
		hs.put(4, "kiran");

		Set<String> set = new HashSet<>(hs.values());
		for(String name : set) {

			System.out.println(name);

		}
		List<Integer> list = new ArrayList<Integer>(hs.keySet());
		for(Integer i : list) {
			// print the less then 3 values only

			if(i>2) {
				System.out.println(i);
				
				}
			
			
			if(i<0 || i>3) {
				System.out.println(i);
			}

		}

	}


}

//}



