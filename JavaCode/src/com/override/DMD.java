package com.override;

public class DMD {
	
	void show() {
		System.out.println("this is the dynamic dispatcher method base");
	}
}
class DMD1 extends DMD {
	
	void show() {
		super.show();
		System.out.println("this is the dynamic dmd sub method");
		
	}
	
	class DMD2 extends DMD{
	
		void show() {
			System.out.println("this is the dmd2 sub class method2");
		}
	}
}
