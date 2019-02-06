package com.cohesion;


// HighCohesion there is the separate class handile the all jobs  
class Name { 
    String name; 
    public String getName(String name) 
    { 
        this.name = name; 
        return name; 
    } 
}  
  
class Age { 
    int age; 
    public int getAge(int age) 
    { 
        this.age = age; 
        return age; 
    } 
}  
  
class Number { 
    int mobileno; 
    public int getNumber(int mobileno) 
    { 
        this.mobileno = mobileno; 
        return mobileno; 
    } 
	
}  

