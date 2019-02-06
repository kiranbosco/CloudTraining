package com.generic;


/* Generic class it can be any type either it can string or float or integer it can access any type
 *  Here is T is any Type
 * 
 * */

 
public class GenericClass <T>{ // this class any type
	private T t;
	public GenericClass(T t) { // Constructor

		this.t=t;

	} 

	public T get() {  // this get method return the T type value
		return t;

	}
	public static void main(String[] args) {

		GenericClass<Integer> integer = new GenericClass<Integer>(100);
		GenericClass<String> str = new GenericClass<String>(" Kiran");	
		GenericClass<Float> flt = new GenericClass<Float>(10.0f);
		System.out.println(integer.get()  +  " " + str.get() + " " + flt.get());
	}
}
