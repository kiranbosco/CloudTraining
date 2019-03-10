package com.udimy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateValues {
	public static void main(String[] args) {

		//Imparative Style
		List<Integer> uniqueValues = Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,4,5);
		
		List<Integer> list = new  ArrayList<>();
		for(Integer integer : uniqueValues) {
			if(!list.contains(integer)) {
				list.add(integer);
			}
		}
		System.out.println(list);
		
		// Declarative Style in java8
		
		List<Integer> uniqe =uniqueValues.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqe);
	}
}