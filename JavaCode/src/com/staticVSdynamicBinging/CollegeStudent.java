package com.staticVSdynamicBinging;

//Dynamic method object
class Student {
    
    public void show(){
          System.out.println("Student details.");
    }
}

public class CollegeStudent extends Student {
   public void show(){
          System.out.println("College Student details.");
    }

    //main method
    public static void main(String args[]){
     //Super class can contain subclass object.   
     Student obj = new CollegeStudent();

     //method call resolved at runtime
     obj.show();
    }
}