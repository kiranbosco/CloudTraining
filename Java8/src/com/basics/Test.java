package com.basics;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	// -------FEAUTRES--------------

	/*
	 * Lambda expression Functional interface Default method and static method
	 * Predicate function inteface predicate consumer supplier Function etc Double
	 * column(::) operator methdo reference constructor reference streams Date and
	 * Time API Opetional class Nashron Java script Engine
	 * 
	 */

	//NOTE : 

	/*
	 * Lambda expression is an anonymous function name less with out return type
	 * with out modifiers 
	 *  
	 *  if body contain only one line curlibraces opetional
	 * 
	 */
	public static void main(String[] args) {

		Function<Integer, Integer> f =i -> i*i; System.out.println(f.apply(5));
		System.out.println(f.apply(10));


		// Testin even number checks

		Predicate <Integer> p=i->i%2==0;
		System.out.println(p.test(3));

		// Odd number checks

		Predicate<Integer> pp =i->i%2!=0;
		System.out.println(pp.test(5));

		// anonymous class sample code





	}

}
