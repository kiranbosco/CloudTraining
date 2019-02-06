package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConncurentModifcationExeInArrayList {


	public static void main(String[] args) {

		//print only unique value avoid the duplicate the value in  list
		CopyOnWriteArrayList<String> list  = new CopyOnWriteArrayList<>();
		list.add("kiran");
		list.add("charan");
		list.add("Heemaja");

		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}

