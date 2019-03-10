package com.collectionsStreams;
import java.util.function.Supplier;

public class TestSupplier {
	
	public static void main(String[] args) {
	
		Supplier<Person> supplier =()->{
			
			return new Person("Nandhini", 9, "Nellore");
		};
		Person p =supplier.get();
		System.out.println(p.getAddress() + " "+ p.getAge()+ " "+ p.getName());
	}

}
