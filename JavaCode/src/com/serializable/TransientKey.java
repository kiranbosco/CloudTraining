package com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*  
 * transient it is the keyword it will be apply in front of the variable it is value need not to persist the object 
 * 
 * */

public class TransientKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7325690639155140391L;
	int id;
	transient int age;
	String name;
	public TransientKey(int id,int age,String name) {

		this.id =id;
		this.name = name;;
		this.age = age;

	}
	public static void main(String[] args) {

		TransientKey tr = new TransientKey(10, 55, "Nag");
		try {
			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\text.txt10");
			ObjectOutputStream oos = new ObjectOutputStream(fis);

			oos.writeObject(tr);
			System.out.println("success");
			oos.close();
			fis.close();
		}catch (Exception e) {
			System.out.println(e);	}
	}


}
