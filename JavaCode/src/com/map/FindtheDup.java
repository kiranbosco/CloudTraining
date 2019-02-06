package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class FindtheDup {
	
	public static void main(String[] args) {
		
	 List list = new ArrayList<>();
	 list.add("kiran");
	 list.add("kiran");
	 list.add("sujatha");
	 list.add("viajy");
	 
		Set<String> uniqueSet = new HashSet<String>(list);
		for(String set : uniqueSet) {
			System.out.println(set);
		}
	 
		
		
		  ArrayList<String> al = new ArrayList<String>(); 
	        al.add("Geeks For Geeks"); 
	        al.add("Friends"); 
	        al.add("Dear"); 
	        al.add("Is"); 
	        al.add("Superb"); 
	  
	        /* Collections.sort method is sorting the 
	        elements of ArrayList in ascending order. */
	        Collections.sort(al); 
	  
	        // Let us print the sorted list 
	        System.out.println("List after the use of" + 
	                           " Collection.sort() :\n" + al); 
	    } 
		
	 
	}


