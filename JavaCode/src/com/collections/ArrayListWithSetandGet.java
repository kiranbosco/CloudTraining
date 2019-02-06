package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithSetandGet {
	
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("kiran");
		al.add("purini");
		al.add("kumar");
		
		System.out.println(al.set(0, "Heemaja"));
		System.out.println(al.get(0));
		
		/*System.out.println(al.get(0));
		
		System.out.println("using set method()");
		
		String s =al.set(0, "charan");
		System.out.println(al.get(0));*/
	}

}
