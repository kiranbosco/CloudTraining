package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Products {
	
	public static void genProducts(List<? extends CustInterface> list) {
		for(CustInterface cst : list) {
			System.out.println(cst);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		List<Customer> list1 = new ArrayList<Customer>();
		list1.add(new Customer());
		
		List<Customer2> list2 = new ArrayList<Customer2>();
		list2.add(new Customer2());
		
		genProducts(list1);
		genProducts(list2);
		
		Customer2 cst = new Customer2();
		cst.billing();
		cst.productDelivery();
		cst.productImpl();
		
		
	}

}
