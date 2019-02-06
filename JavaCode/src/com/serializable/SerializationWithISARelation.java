package com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializationWithISARelation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4013012394628853036L;
	/**
	 * 
	 */
	String empName;
	String empLoc;
	ISARelationEmpDetails isaRelation;

	public SerializationWithISARelation(String empName,String empLoc,ISARelationEmpDetails isaRelation) {

		this.empLoc = empLoc;
		this.empName = empName;
		this.isaRelation = isaRelation;

	}
	public static void main(String[] args) {
		ISARelationEmpDetails s = new ISARelationEmpDetails("INDIA");
		SerializationWithISARelation sr = new SerializationWithISARelation("Nandhini", "Banglore", s);
		try {
			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\text.txt9");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(sr);
			oos.close();
			oos.flush();
			fis.close();
			fis.flush();
			System.out.println("success");
		}
		catch (Exception e) {
			System.out.println(e);		}
	}

}
