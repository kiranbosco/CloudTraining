package com.collections;

import java.util.PriorityQueue;

public class QueuesExe {

	public static void main(String[] args) {

		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("charan");
		p.add("Heemaja");
		p.add("Nandhini");
		p.add("varshini");

		for(String s : p) {
			System.out.println(s);
		}




	}

}
