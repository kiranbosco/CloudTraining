package com.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExe {

	public static void main(String[] args) {

		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		map.put(100,"Amit");    
		map.put(102,"Ravi");    
		map.put(101,"Vijay");    
		map.put(103,"bahul");   
		
	//	map.put(null, "amit"); null cant be accepted
	//	map.put(null, "john");

		map.entrySet()
		.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
