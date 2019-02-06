package com.constructor;

class Person  
{  
    String name,address;   
    int age;  
    public Person(int age, String name, String address)  
    {  
        this.age = age;  
        this.name = name;  
        this.address = address;  
    }  
}  
class Emp extends Person   
{  
    float salary;  
    public Emp(int age, String name, String address, float salary)  
    {  
        super(age,name,address);  
        this.salary = salary;  
    }  
    void disp() {
    	System.out.println(age + ""+ name + ""+ address +""+ salary);
    }
}  