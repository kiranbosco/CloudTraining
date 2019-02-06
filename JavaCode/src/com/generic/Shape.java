package com.generic;

import java.util.ArrayList;
import java.util.List;

/* The question mark symple ? it can repracent any kind of element  if we write the <List ? extends Number > 
 * it means any type of either it is the integer or float or double now we can call the method of number any child class object
 * there are 3 type of bounds 
 * 
 * 1 bounded &  in this bounded we can pass the some restricted parameters only
 * un bounded  :- in this parametes we can pass any type of parameters
 * 2 lower bounded in this bounded we can pass the super class parameters only
 * 3 upper bounded :- in this bounded we can pass sub class parameters only
 * */	
abstract class Shape{
	abstract void draw();

	void run() {
		System.out.println("i am run method()");
	}
}

class Rectangle extends Shape{

	@Override
	void draw() {
		super.run();
		System.out.println("this is the rectangle method()");		
	}

}
class Circle extends Shape{

	@Override
	void draw() {

		System.out.println("this is the circle method()");		
	}

}






