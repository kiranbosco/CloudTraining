package com.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("peter");
		ll.add("fransis");	
		ll.add("mathew");
		
		ll.add(0, "bosoc");
		ll.add(2, "Mark");
	/*	
		LinkedList<String> list = new LinkedList<>();
		list.add("kiran");
		list.add("bsoco");
		list.add("charan");
		list.addAll(ll);
		list.addAll(3, ll);
		list.addFirst("mathew");
	
	*/

	Collections.reverse(ll);		
		
		System.out.println(ll);
	}

}
