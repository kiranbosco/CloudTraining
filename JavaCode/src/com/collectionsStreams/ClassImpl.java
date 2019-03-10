package com.collectionsStreams;

public class ClassImpl  implements Left,Right{
	
	public void  m() {
		
//		Right.super.m();
		Left.super.m();
	}
public static void main(String[] args) {
	
	ClassImpl cls = new ClassImpl();
	cls.m();
}
}