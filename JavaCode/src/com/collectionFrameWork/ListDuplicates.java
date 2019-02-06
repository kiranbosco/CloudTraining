package com.collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* here is the we can find the duplicate values using index method()
 * we can take the set method() to take the if condition like this if(s.add(duplicates)==false){sop duplicates print}
 * 
*/
public class ListDuplicates {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(11);
		list.add(13);
		list.add(15);
		list.add(13);
		list.add(15);
		list.add(11);
		


		Set set = new HashSet<>();
		for(Integer duplicates : list) {
		if(set.add(duplicates)==false) {
			System.out.println(duplicates);
		}
		}
		System.out.println();
		
		//conver the string array into list in java()
		
		String arr [] = {"krian","kumar","purini","java consultent"};

		List convert = Arrays.asList(arr);
		
		Iterator itr = convert.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
