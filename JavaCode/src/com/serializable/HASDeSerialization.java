package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HASDeSerialization {
	public static void main(String[] args) {

		SerializationWithISARelation sr =null;
		try {

			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\text.txt9");
			ObjectInputStream ois = new ObjectInputStream(fis);
			sr =(SerializationWithISARelation)ois.readObject();
			System.out.println(" data has been printed ");
			System.out.println(sr.empLoc + " "+ sr.empName );

		}
		catch (Exception e) {
			System.out.println(e);		}
	}

}
