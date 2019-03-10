package com.collectionsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValueBecomeDouble {
	public static void main(String[] args) {
		

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(3);
		list.add(15);
		list.add(20);
		
		ArrayList<Integer>  ll = new ArrayList<>();
		for(Integer i : list) {
	
			ll.add(i-2);
		}
		System.out.println(ll);
		
		// Java 8 using streams add the doouble vaues in each element
		List<Integer> l = list.stream().map(z->z*2).collect(Collectors.toList());
		System.out.println(l);
	}

}
