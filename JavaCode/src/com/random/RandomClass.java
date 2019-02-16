package com.random;

import java.util.Random;

public class RandomClass {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int i = ran.nextInt(10);
		System.out.println(i);
	}

}
