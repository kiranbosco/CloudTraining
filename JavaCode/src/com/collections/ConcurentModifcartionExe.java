package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*Question :- when will u get the concurentModifcationException in java
 * 
 * failfast :- when ur objects has iterator and u can add some list of value that time u willbe geting the 
 * concurent modifcation exception  if u want over come this exception we having failsafe concept
 * 
 * failfafe :- java arraylist class has introduced one class ConcurentHashMap() this class will be given fail safe to ur object 
 * 
 * 
 * 
*/public class ConcurentModifcartionExe {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap();
		map.put(1, "One");
		map.put(2, "tow");
		map.put(3, "three");
		map.put(6, "six");

			for(Map.Entry<Integer, String>entry :map.entrySet()) {
				
				System.out.println(entry.getKey() + " "+ entry.getValue());
				map.put(4, "four");
				map.put(5, "five");
				map.put(7, "seven");

			}
		}
	}

