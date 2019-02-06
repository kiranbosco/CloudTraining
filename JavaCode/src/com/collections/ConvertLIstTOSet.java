package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConvertLIstTOSet {
	
	public static void main(String[] args) {
		
		 ArrayList<String> list=new ArrayList<String>();  
         list.add("Ravi");  
         list.add("Vijay");  
         list.add("Ajay");
         list.add("Ravi");
         
         Set s = new HashSet<>(list);

         Iterator<String> itr =s.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
	}

}
