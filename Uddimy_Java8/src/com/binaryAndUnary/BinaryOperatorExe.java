package com.binaryAndUnary;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExe {

	static Comparator<Integer> compar =(a,b)->a.compareTo(b);
	
	public static void main(String[] args) {

		BinaryOperator<Integer> binaryO =(a,b)->a+b;
		System.out.println(binaryO.apply(5, 6));

		System.out.println("count");
		BinaryOperator<Integer> maxBy =BinaryOperator.maxBy(compar);
		System.out.println(maxBy.apply(7, 9));
		System.out.println("Max");

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(compar);
		System.out.println(minBy.apply(7, 10));
		System.out.println("min");
		
		
	}
}
