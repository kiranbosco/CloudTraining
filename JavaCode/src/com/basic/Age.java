package com.basic;

public  class Age {
	
	public static void m(int age) {}
	
	public void m () {} // override
	
	public static void m(String name) {}
	

	public static void main(String[] args) {
		
		int age =11;
		
	/*	if(age!=10) {
			System.out.println("Get chance to play the game");
		}
		else {
			System.out.println("sorry");
		}*/
		
	/*	if(age ==11 && age==11) {
			System.out.println("play with me game");
			
		}
		else {
			System.out.println("Sorry");

		}*/  // It will not check the if first condition is fail to second condition
	
/*	if(age ==10 || age==11) {
		System.out.println("it is the equal");
	}
	else {
		System.out.println("NOt equal age");
	}*/  // This will not check the second condition if it is true first condition 
		
	
	/*	if(age>12) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}*/
		
		String s ="kiran";
		System.out.println(s.replace('n', 'N'));
		
	
	}
}
