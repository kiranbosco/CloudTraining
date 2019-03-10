package com.collectionsStreams;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExe {
	
	public static void main(String[] args) {
		
		Consumer<String> c =s->System.out.println(s);
		c.accept("Hello");
		c.accept("Kiran");

	Consumer<Integer> i =p->System.out.println(p);
	i.accept(123);
	i.accept(456);
	
	// Supplier
	
	
	
	
	
}

}