package com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListToTreee {

	public static void main(String[] args) {
		 
		List<String> list = new ArrayList<>();
	    list.add("kiran");
	    list.add("charan");
	    list.add("apple");
	    list.add("bananna");
	    list.add("bananna");
	    list.add("charan");

	    Set s = new HashSet<String>(list);
	   
	   Iterator<String> itr = s.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	    
	}
	}
	
