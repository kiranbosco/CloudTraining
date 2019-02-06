package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExe {
	
	public static void main(String[] args) {
		
		TreeSet<String> tr = new TreeSet<>();
		tr.add("krian");  // it cant accept the duplicate value
		tr.add("krian");
		tr.add("Nandhu");
		tr.add("charan");
	//	tr.add(null); // it can't accept the null value if ur add null it will throw nullpointer exception 
		 
		// it will be print  the order  preserved 
		Iterator<String> itr = tr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
