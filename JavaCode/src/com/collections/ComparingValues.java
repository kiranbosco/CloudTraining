package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingValues {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(1, "eight");
		map.put(2, "five");
		map.put(3, "four");
		map.put(4, "three");
		map.put(5, "two");
		map.put(6, "one");
		map.put(0, "zero");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);

		// Map desending Orderd

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		
	}

}
