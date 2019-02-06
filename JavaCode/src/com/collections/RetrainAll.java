package com.collections;

import java.util.ArrayList;

// using rettain all the elements for the arraylist
public class RetrainAll {

	public static void main(String args[]){  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ajay");
		al.isEmpty();
		ArrayList<String> ll = new ArrayList<>();

		ll.add("ravi");

		ll.add("charan");
		ll.add("kamal");

		al.retainAll(ll);

//		System.out.println(al.isEmpty());
		boolean b =al.isEmpty();
		System.out.println(b);
		System.out.println(ll);

	}
}