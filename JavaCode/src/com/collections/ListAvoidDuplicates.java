package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListAvoidDuplicates {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("kiran");
		list.add("kiran");
		list.add("kiran");
		list.add("vijay");
		list.add("vijay");
		list.add("sujatha");


		
		List<String> name = new ArrayList<>();
		for(String emp :list) {
			if(!name.contains(emp)) {
				name.add(emp);
			//	System.out.println(name);

				}
		}
		
		for(String str : name) {
			System.out.println(str);
		}
		}
	}
