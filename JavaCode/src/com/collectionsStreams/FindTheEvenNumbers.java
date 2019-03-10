package com.collectionsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheEvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(3);
		list.add(15);
		list.add(20);
		
		ArrayList<Integer> ll = new ArrayList<>();
		for(Integer i : list) {
			if(i%2==0) {
				
				ll.add(i);
			}
		}
		System.out.println(ll);
		
		
		// java 8 Using Filters

		List<Integer> l =list.stream().filter(z->z%2==0).collect(Collectors.toList());
		System.out.println(l);
	}
	
	}

