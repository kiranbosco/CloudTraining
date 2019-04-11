package com.streams.singleTone;

public class Test {

    public static Test obj =null;

    private Test(){}

     public static Test tesInstance() {

         if (obj == null) {
             return new Test();
         }
         return obj;
     }

     public void  m(){
         System.out.println("sample code");
     }

    public void  m1(){
        System.out.println("sample code 1");
    }
    public static void main(String[] args) {

        Test testobj = Test.tesInstance();
        testobj.m();
        testobj.m1();
    }
    }

