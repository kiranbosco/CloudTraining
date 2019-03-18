package com.binaryAndUnary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/*
 when evever you mey get the same response input and out put you can use the unary operator in java8
this function consist the maxBy and minBy method()*/
 public class UnaryOperatorExe {

	 
	static UnaryOperator<String>  unary =(stu->stu.concat(" Default"));

	static BinaryOperator<Integer> bin=( a , b)->a+b;
	
	
	public static void main(String[] args) {
		System.out.println(unary.apply(" Java8"));
		System.out.println(bin.apply(10, 20));

	}

}
