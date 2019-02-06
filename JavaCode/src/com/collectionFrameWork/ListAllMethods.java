package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethods {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		// add method()
		list.add("peter");
		list.add("john");
		list.add("joseph");
		list.add("bosco");

		List<String> ll = new ArrayList<>(list);


		//addAll() this method is convert the one list objects to another list object
		ll.addAll(list);

		ll.add("ind");
		ll.add("usa");
		ll.add("pak");
		ll.add("aus");

		ll.remove("usa"); // this is the remove the element

		//		ll.removeAll(list); // it is the remove the all the elements

		// claar() // it will be clear all the method()

		System.out.println(ll);
		//	System.out.println(ll.contains("pakistan"));

	}

}
