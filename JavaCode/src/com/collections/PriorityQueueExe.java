package com.collections;

import java.util.PriorityQueue;

// priorityQueue is following FIFO order manner First in First Out 
public class PriorityQueueExe {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> p = new PriorityQueue<>();
		p.add("Rahul");
		p.add("sachin");
		p.add("tendulkar");
		
		for(String s : p) {
			System.out.println(s);
		}
	}

}
