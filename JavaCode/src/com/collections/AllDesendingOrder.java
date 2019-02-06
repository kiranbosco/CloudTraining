package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("rawtypes")
public class AllDesendingOrder {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList();
		
		list.add("krian");
		list.add("vijay");
		list.add("charan");
		list.add("suji");
		
		Iterator<String> itr =list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


		
	}

}
