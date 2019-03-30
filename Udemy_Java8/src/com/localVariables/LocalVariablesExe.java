package com.localVariables;

import java.util.function.Consumer;

public class LocalVariablesExe {
	// java  lambda local variable does not use the duplicates values examples like this
	public static void main(String[] args) {
		
	/// i=0;
		Consumer<Integer> consumer =(i)->{
		//	int i =2; this is not allow duplicate values
			System.out.println(i);
		};
	}

}
