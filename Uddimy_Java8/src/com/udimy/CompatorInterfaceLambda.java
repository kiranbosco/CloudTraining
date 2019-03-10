package com.udimy;

import java.util.Comparator;

public class CompatorInterfaceLambda {

	public static <integer> void main(String[] args) {

		//Imparative Style in java7

		Comparator<Integer> imparativeStyle = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println("Imparative Style  : " +imparativeStyle.compare(3, 2) ) ;

		//Declarative Style in java8
		Comparator<Integer>declarativeStyle =(Integer a, Integer b)->a.compareTo(b);
		System.out.println("Imparative Style  : " +imparativeStyle.compare(3, 5) ) ;
		
		/*
		 * any inteface can have one abstract mehthod which is the functional interface
		 * in java
		 *  
		 * There are four type of interface in java 8
		 * 
		 * consumer
		 * predicate 
		 * function
		 * supplier
		 */
		
		
	}
}
