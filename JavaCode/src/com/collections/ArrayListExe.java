package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListExe {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		  List list = new ArrayList<>();  
		     list.add(10);  
		     list.add(50);  
		     list.add(30);  
		     list.add(60);  
		     list.add(20);  
		     list.add(90);  
		     
		       
		     Iterator i = list.iterator();  
		     System.out.println("printing the list....");  
		     while(i.hasNext())  
		     {  
		         System.out.println(i.next());  
		     }  
		      
		     System.out.println();
		     
		     
		   Comparator c = Collections.reverseOrder();
		   Collections.sort(list, c);
		   Iterator itr = list.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		       
		}  
		}  
	