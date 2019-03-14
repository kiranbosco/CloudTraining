package com.udimy.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p =(i)->{return i%2==0;};
	static Predicate<Integer> s =(b)->b%5==0;
	
	public static void predicareAnd() {
		System.out.println(p.and(s).test(10));
		System.out.println(p.and(s).test(9));

	}
	
	public static void predicateOr() {
		System.out.println(p.or(s).test(8));
		System.out.println(p.or(s).test(10));
	}
	// Nagate method is give to reverse response or negitive response
	public static void predicateNegate() {
		System.out.println(p.or(s).negate().test(8));
	}
	
	
	/*
	 predicate is the one of the abstract method it is going to take input and return some boolean values
	 * it can suport the and() operation or() operation and negate() operation 
	 * if ur print the single line of code you dont need to write the curlebraces {} and no return type in predicate 
	 */
	public static void main(String[] args) {


		System.out.println(p.test(4));
		System.out.println(s.test(4));

		predicareAnd();
		predicateOr();
		predicateNegate();

	}

}
