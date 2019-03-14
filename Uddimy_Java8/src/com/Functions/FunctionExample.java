package com.Functions;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> func =(name)->name.toUpperCase();
	static Function<String, String> andThenMethod =(name)->name.toUpperCase().concat("kumar");
	public static void main(String[] args) {
		System.out.println(func.apply("charan teja , heemaja"));
		System.out.println(func.andThen(andThenMethod).apply(" kiran ").toUpperCase());
		System.out.println(func.compose(andThenMethod).apply(" Nandhini varshini srilakshmi"));
	}

}
