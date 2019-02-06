package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExe {

	 public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  // fetching  the key
		 
		  System.out.println(hm.keySet() + " "+ hm.values());
		  
		  for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			  System.out.println(entry.getKey() + " "+ entry.getValue());
		  }
		  
}
}
