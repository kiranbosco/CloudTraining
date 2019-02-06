package com.constructor;

class Main {
	public static void main(String[] args) {


		Emp e = new Emp(10, "kiran", "nlr", 900000);
        System.out.println("Name: "+e.name+" Salary: "+e.salary+" Age: "+e.age+" Address: "+e.address);  
	}
}