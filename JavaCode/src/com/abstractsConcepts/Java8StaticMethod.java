package com.abstractsConcepts;

interface  Java8StaticMethod {
	
 static int sum(int x) {
	 
	 return x+x;
 }
 static int mul(int x) {
	 
	 return x*x;
	 
 }
}
class StaticMethod implements Java8StaticMethod{
	
public void count() {
	System.out.println("this is the count method()");

}
}