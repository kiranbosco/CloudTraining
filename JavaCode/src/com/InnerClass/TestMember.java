package com.InnerClass;

public class TestMember {
	
	private int  i =30;
	
	class Inner {
		
		void message() {
			System.out.println("i can access the outer private varable here " + i);
		}
	}
	public static void main(String[] args) {
		
		TestMember t = new TestMember();
		TestMember.Inner tt = t.new Inner();
		tt.message();
	}

}
