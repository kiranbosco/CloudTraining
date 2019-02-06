package com.InnerClass;

/*
JAVA INNER CLASSES :- A class contain inside the another class is called sa innerclass
it can be access the outside the private variable and methods any data members also 
there is some advantages  here is the mainly code reuUseablity and we can write the very less code
and code optimize

*/
public class OuterClass {

	private int id;
	private int sal;
	private String name;
	private String designation;

	public OuterClass(int id, int sal, String name, String designation) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.designation = designation;
	}
	public void disp() {
		System.out.println(id + " "+ sal + " "+ name + " "+ designation);
	}

	private void employee() {

		String address ="nellore";
		String location ="Banglore";
		System.out.println(address + " "+ location);
		int sr =address.length();
		char [] ch =new char[8];
	   location.getChars(2, 5, ch, 0);
	   System.out.println( ch);
	}


	class InnerClssAccess{

		public void innerMethod() {
			disp();
			employee();
			m();
			
		}
		public void m() {
			System.out.println("hello");
			
		}

	}
	public static void main(String[] args) {

		  OuterClass o = new OuterClass(10, 41000, "kiran", "JavaConsultent");
		  OuterClass.InnerClssAccess in =o.new InnerClssAccess();
		  in.innerMethod();
	}
}
