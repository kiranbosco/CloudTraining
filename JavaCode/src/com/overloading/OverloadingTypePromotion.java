package com.overloading;

 class test {
	
	static public int add(int a, int b) {
		return a+b;
	}
	
	static public float add(int c , float b) {
		return c+b;
		
	}
}
	class OverloadingTypePromotion {   

	
	public static void main(String[] args) {
		
		OverloadingTypePromotion cs = new OverloadingTypePromotion();
		System.out.println(test.add(10, 20));
		System.out.println(test.add(5, 10.f));
		
		
		
				
	}

}
