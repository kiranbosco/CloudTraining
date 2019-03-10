package com.udimy;

import java.util.stream.IntStream;

public class ImparativAndDeclarativeStyle {
	
	public static void main(String[] args) {
		
		// imparative style
		int sum=0;
		for(int i=0; i<100; i++) {
			 sum+=i;
		}
		System.out.println(sum);
		
		//Declarative Style
		
		int sum1 =IntStream.range(0, 100)
			//	.parallel()
				.sum();
		System.out.println(sum1);
		
		

		
	}

}
