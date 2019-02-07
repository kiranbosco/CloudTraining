package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapWIthBook {

	int id;    
	String name,author,publisher;    
	int quantity; 

	@Override
	public String toString() {
		return "HashMapWIthBook [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	}
	public HashMapWIthBook(int id, String name, String author, String publisher, int quantity) {    
		this.id = id;    
		this.name = name;    
		this.author = author;    
		this.publisher = publisher;    
		this.quantity = quantity;    
	}  
	public static void main(String[] args) {

		Map<Integer, HashMapWIthBook> map = new HashMap<>();

		HashMapWIthBook hs = new HashMapWIthBook(8, "krian", "charan", "vijay", 9);
		HashMapWIthBook hsp = new HashMapWIthBook(4, "krian", "charan", "vijay", 9);
		HashMapWIthBook hss = new HashMapWIthBook(3, "krian", "charan", "vijay", 9);
		map.put(1, hs);
		map.put(3, hsp);
		map.put(2, hss);

		/*	for(Map.Entry<Integer, HashMapWIthBook > entry :map.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}*/

		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);

	}
}    

