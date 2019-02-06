package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void genMehod(List<? extends Shape> list) {
		
		for(Shape sh : list) {
			System.out.println(sh);
			sh.draw();
		}
	}

	public static void main(String[] args) {
		
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		
		List<Circle> list2 = new  ArrayList<Circle>();
		list2.add(new Circle());
		
		genMehod(list1);
		genMehod(list2);
			
	}
		
	}

		
	

