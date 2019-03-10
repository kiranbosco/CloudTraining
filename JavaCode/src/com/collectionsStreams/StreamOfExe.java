package com.collectionsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfExe {


	/*
	 * Stream<Integer> stream=Stream.of(1,2,3,4,5);
	 * 
	 * Stream<Integer> str=Stream.of(new Integer[] {1,2,3,4,5,6});
	 */
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<20;i++) {
			list.add(i);
			System.out.println(i);
		}
	}
}



