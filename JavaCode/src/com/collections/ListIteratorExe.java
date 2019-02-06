package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


// ListIterator is used to retrive the data from the  iteration it has contain 9 methods()
public class ListIteratorExe {
	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();    
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add(1,"Sachin");  

        ListIterator<String>itr = al.listIterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	
        	itr.hasPrevious();
        }
        
	}

}
