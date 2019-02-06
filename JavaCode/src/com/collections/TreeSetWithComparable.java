package com.collections;

import java.util.TreeSet;

public class TreeSetWithComparable implements Comparable<TreeSetWithComparable>{

	int id; 
	String name,author,publisher;  
	int quantity; 

	@Override
	public String toString() {
		return "TreeSetWithComparable [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	}

	public TreeSetWithComparable(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}
	@Override
	public int compareTo(TreeSetWithComparable b) {

		if(id > b.id) {
			return 1;
		}  
		else if( id < b.id) {
			return -1;
		}
		else 
			return 0;
	}

	public static void main(String[] args) {

		TreeSet<TreeSetWithComparable> ts = new TreeSet<>();
		ts.add(new TreeSetWithComparable(10, "kiran", "babby", "Nana anna", 7));
		ts.add(new TreeSetWithComparable(11, "kiran", "babby", "Nana anna", 7));
		ts.add(new TreeSetWithComparable(10, "kiran", "babby", "Nana anna", 7));
		ts.add(new TreeSetWithComparable(12, "kiran", "babby", "Nana anna", 7));

		for(TreeSetWithComparable s : ts) {
			System.out.println(s);
		}

	}
}
