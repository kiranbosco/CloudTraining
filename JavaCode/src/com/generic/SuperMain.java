package com.generic;

import java.util.ArrayList;
import java.util.List;

// this is the lower bounded type here is we can pass the super calss parameters 

public class SuperMain {
	
	public static void superMethodPrintMe(List<? super CustInterface> list) {
		
	}

	public static void main(String[] args) {
		
		List<CustInterface> list1 = new ArrayList<CustInterface>();
		list1.add(new Customer());
		
		superMethodPrintMe(list1);
		
		CustInterface cst = new Customer();
		cst.billing();
		cst.productDelivery();
	}
}
