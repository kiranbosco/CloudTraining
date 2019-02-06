package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {

		// here is the checking the content and if the value is matchin it will be remove
		ArrayList<String> list = new ArrayList<>();
		list.add("kolkata");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("pune");

		if(list.contains("Mumbai")) {
		//	list.remove(1);
			list.remove("Mumbai");
		}

		Iterator<String >itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

		// here is the avoiding the duplicate values
		ArrayList<String> name = new ArrayList<>();
		for(String emp :list) {
			if(!name.contains(emp)) {
				name.add(emp);

			}
		}
		for(String e : name) {
			System.out.println(e);
		}


	}
}

