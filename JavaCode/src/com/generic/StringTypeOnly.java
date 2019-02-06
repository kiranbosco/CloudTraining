package com.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringTypeOnly {

	public void m1(List<String> list) {
		list.add("vijay");
		list.add("sujatha");
		list.add("Heemaja");
;		list.add("krian");
		list.add(null);
	//	list.add(10); Here is the accepted only integer type only but not any type orgments
		list.add("charan");

		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		System.out.println(list);

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		StringTypeOnly str = new StringTypeOnly();
		str.m1(list);
		

	}

}
