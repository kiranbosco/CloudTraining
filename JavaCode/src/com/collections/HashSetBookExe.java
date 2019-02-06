package com.collections;

import java.util.HashSet;

public class HashSetBookExe {

	int id;  
	String name,author,publisher;  
	int quantity;  

	@Override
	public String toString() {
		return "HashSetBookExe [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	}

	public HashSetBookExe(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}  
	public static void main(String[] args) {
		HashSet<HashSetBookExe> set = new HashSet<>();
		set.add(new HashSetBookExe(20, "joseph", "stell", "purijis", 8));

		set.add(new HashSetBookExe(20, "joseph", "stell", "purini", 9));
		set.add(new HashSetBookExe(20, "joseph", "vijay", "Ramanaih", 8));

		for(HashSetBookExe hs : set) {
			System.out.println(hs);
		}
	}
}  

