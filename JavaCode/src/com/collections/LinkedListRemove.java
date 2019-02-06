package com.collections;

import java.util.LinkedList;

public class LinkedListRemove {


    public static void main(String [] args)  
    {  
       LinkedList<String> ll=new LinkedList<String>();  
       ll.add("Ravi");  
       ll.add("Vijay");  
       ll.add("Ajay");  
       ll.add("Anuj");  
       ll.add("Gaurav");  
       ll.add("Harsh");  
       ll.add("Virat");  
       ll.add("Gaurav");  
       ll.add("Harsh");  
       ll.add("Amit");
       
        // remove the element
       System.out.println(ll);
       ll.remove("Vijay");  
       ll.remove(0);

}
}
