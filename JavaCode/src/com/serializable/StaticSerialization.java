package com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")


/* when ur apply static in serialization process it will not treated as serialization why because it is 
 * part of the class level but it serialization is the part of the object level it will not store the value 
*/

public class StaticSerialization implements Serializable{

	static	int id;  
	static	String name;  	String company="SSS IT Pvt Ltd";//it won't be serialized  
	public StaticSerialization(int id, String name,String company) {  
		this.id = id;  
		this.name = name; 
		this.company = company;
	}  

	public static void main(String[] args) {

		StaticSerialization  sts = new StaticSerialization(55, "cloudFx","kiran");
		try {
			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\text.txt10");
			ObjectOutputStream obj = new ObjectOutputStream(fis);
			obj.writeObject(sts);
			obj.close();
			obj.flush();
			fis.close();
			fis.flush();
			System.out.println("success");

		}
		catch (Exception e) {
			System.out.println(e);		}

	}
}  

