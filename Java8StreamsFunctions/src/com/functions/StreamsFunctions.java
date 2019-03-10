package com.functions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFunctions {
	public static void main(String[] args) {
		
		//Filters
		
		List<String> name = Arrays.asList("kiran","kumar","purini","charan","teja");
		List<String> list =name.stream().filter(n ->!"kian".equals(n)).collect(Collectors.toList());
		
		System.out.println(list);
		}
		
	}
