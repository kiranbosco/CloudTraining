package com.finalKey;

public class Description {
	
	
/*	Final keyword:- Onece ur declered final keyword in frient of class or method or varable 
	it is value constant it is never going to be changed 
	
	varable :- final int age=99; 
    
    method() :-  once ur declered final key word in frient of method it will never overriden to sub class
    
    class :- uf ur declered final keyword in frient of class ur not extends the class to sub class


Questions :-  Is final method inherited?
Ans :- yes but u cont override it








*/
	  static final int data;//static blank final variable  
	  static{ data=50;}  
	  public static void main(String args[]){  
	    System.out.println(Description.data);  
	 }  	
	
}
