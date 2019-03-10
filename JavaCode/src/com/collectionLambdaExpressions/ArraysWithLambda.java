package com.collectionLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysWithLambda {
	public static void main(String[] args) {


		ArrayList<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(60);
		list.add(20);
		list.add(15);
		list.add(5);
		
		
		Collections.sort(list, (list1 ,list2)-> (list1 >  list2)? -1 : (list1 < list2) ?1 :0);
		System.out.println(list);
		

		// lamdas expression applicable collections list also
		
	}
}
