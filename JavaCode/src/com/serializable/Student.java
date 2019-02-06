package com.serializable;

import java.io.Serializable;

//Serialization is mechanism this will be convert the object byte stream for security purpose we can implement the class serialization it is contain java.io.serialization package

public class Student  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3852485598840681350L;
	int id;
	String name;
	long ph;
	
	public Student(int id,String name,long ph) {
		
		this.id =id;
		this.name =name;
		this.ph= ph;
	}

	public void disp() {
		System.out.println(id + " " +name + " "+ ph);
	}
}