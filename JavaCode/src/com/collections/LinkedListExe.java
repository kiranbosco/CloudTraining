package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExe {
	
	public static void main(String[] args) {
		
		LinkedList<String>ll = new LinkedList<>();
		ll.add("john");
		ll.add("peter");
		ll.addFirst("Charan");
		ll.add("bosco");
		
		Iterator<String> itr =ll.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}			
		}
	}

