package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TresetDesending {

	public static void main(String[] args) {
		
		TreeSet<String> tr = new TreeSet<>();
	//	tr.add("krian");  // it cant accept the duplicate value
		tr.add("krian");
		tr.add("Nandhu");
		tr.add("charan");
		
		Iterator<String> itr =tr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
