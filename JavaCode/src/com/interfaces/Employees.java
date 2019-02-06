package com.interfaces;

// Address Hah a Realation passing here entity object here

public class Employees {

	int id;
	String name;
	Address address;
	EmpDsg empdsg;
	
	public Employees(int id, String name,Address address, EmpDsg empdsg) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.empdsg = empdsg;
	}
	void disp() {
		System.out.println(id + ""+ name);
		System.out.println(address.city + ""+ address.country +""+ address.state);
		System.out.println(empdsg.designation + ""+ empdsg.technologys);
	}
	
	public static void main(String[] args) {
		
		Address adr = new Address("nellore ", "ap ", " ind");
		EmpDsg e = new EmpDsg(" JavaDeveloper ", " java springBoot , Rest , Microservices, Mysql");
		Employees emp = new Employees(10, " bosco",  adr,e);
		emp.disp();
		
	}
}
	
	
	