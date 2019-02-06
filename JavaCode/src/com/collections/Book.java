package com.collections;

import java.util.ArrayList;
import java.util.List;

class Book {  
	int id;  
	String name,author,publisher;  
	int quantity; 
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	public Book(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}  
	public static void main(String[] args) {

		List<Book> list = new ArrayList<>();
		list.add(new Book(10, "stella", "bosco", "joseph", 15));
		list.add(new Book(15, "stella", "bosco", "joseph", 15));
		list.add(new Book(13, "stella", "bosco", "joseph", 15));

		for(Book bb : list) {
			System.out.println(bb);
		}
	}
}  