package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

// it cant allow the duplicate  it can maintin the order 
public class LinkedHashSetExe {
	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("kiran");
		hs.add("kumar");
		hs.add("kiran");
		hs.add("charan");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
