package com.collectionsStreams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilters {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Peter", "john", "Greg", "Ryan");

		// java 7 code
	for(String str :names) {
		if(!str.equals("john")) {
			System.out.println(str);
		}
	}
	// java 8 code

		
	}
	
	public boolean isNotjohn(String name) {
		return !name.equals("john");
	
	}
}