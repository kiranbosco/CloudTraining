package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConncurentModifcationExeInArrayList {


	public static void main(String[] args) {

		/*
		 * //print only unique value avoid the duplicate the value in list
		 * CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		 * list.add("kiran"); list.add("charan"); list.add("Heemaja");
		 * 
		 * Iterator<String> itr = list.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		
		int arr[] = {1,5,6,3};
		List list = Arrays.asList(arr);
		
		for(Integer i :  arr) {
			
			System.out.println(i);

		}
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		
	Object obj[] = al.toArray();
	for(Object o : al) {
		System.out.println(o);
	}
		
	}
}

