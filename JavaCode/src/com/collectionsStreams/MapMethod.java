package com.collectionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,5,2,56,8,4,5);
		
		List<Integer> ll =list.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println(ll);
		
		List<Integer> l = list.stream().map(j->j*2).collect(Collectors.toList());
		System.out.println(l);
		
		List<Integer> k = list.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(k);
		
		List<Integer> a =list.stream().map(j->j*j).distinct().collect(Collectors.toList());
		System.out.println(a);
		
		
		
		
	}
}
