package com.localVariables;

import java.util.function.Consumer;

public class EfectivelyFinal {
	
	public static void main(String[] args) {
		
		int value=4;
		Consumer<Integer> consumer = (j)->{
		//	 value =6;  efectively final error cant modify the local variable inside the body same value
			// System.out.println(i + value);
		};
	}

}
