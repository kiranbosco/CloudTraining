package com.generic;

import java.util.ArrayList;
import java.util.List;


public class Number {

private static void PrintMe(List<Integer> list) {
	for(Integer i : list) {
		System.out.println(i);
	}
	System.out.println();	
	}


private static void PrintMe1(List<Float> list1) {
	
	for(Float s : list1) {
		System.out.println(s);
	}
}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		List<Float> list1 = new ArrayList<Float>();
		list1.add(10.5f);
		list1.add(13.5f);
		list1.add(11.5f);

		
		
		PrintMe(list);
		PrintMe1(list1);
		
			
		}

	

	
	}

