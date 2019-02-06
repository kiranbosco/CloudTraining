package com.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExe {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("amma");
		v.add("nana");
		v.add("akka");
		v.add("anna");
		
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
