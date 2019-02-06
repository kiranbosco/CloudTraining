package com.compareTo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Movie> list= new ArrayList<>();
		list.add(new Movie(3.7d, 2012, "linga"));
		list.add(new Movie(3.1d, 2019, "mahanati"));
		list.add(new Movie(2.2d, 2017, "bahubali"));
		list.add(new Movie(3.0d, 2016, "simha"));
		list.add(new Movie(1.2, 2014, "badrai"));
		Collections.sort(list);
		for(Movie cm : list) {
			System.out.println(cm);
		}
		
		System.out.println();

		
		// comparator
		
		ArrayList<ComparatorExe> ll = new ArrayList<>();
		ll.add(new ComparatorExe(205, "kabhi", 3.9));
		ll.add(new ComparatorExe(204, "kushi", 1.2));
		ll.add(new ComparatorExe(202, "kamal", 2.2));
		ll.add(new ComparatorExe(203, "rubi",1.1));
	
		Collections.sort(ll, new CompareYear());
		for(ComparatorExe exe : ll) {
			System.out.println(exe);
		}
	}
}
	
	
	
	
	
	
	
