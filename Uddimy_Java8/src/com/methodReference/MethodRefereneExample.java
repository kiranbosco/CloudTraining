package com.methodReference;
import java.util.function.Function;

public class MethodRefereneExample {
	static Function<String, String> method =(s->s.toUpperCase());
	
	static Function<String, String> toUpperCaseExe =String ::toUpperCase;
	

	public static void main(String[] args) {
		System.out.println(toUpperCaseExe.apply("Mother mary remember my two names in ur prayer"));
			System.out.println(method.apply("What a friend  we have in jesus thank you lord"));
	}

}
