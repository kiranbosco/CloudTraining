package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StaticDesrialization {
	public static void main(String[] args) {
		StaticSerialization st = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\text.txt10");
			ObjectInputStream oos = new ObjectInputStream(fis);
			st =(StaticSerialization)oos.readObject();
			System.out.println("success");
			System.out.println(st.id + " "+ st.name + " "+ st.company);
			oos.close();
			fis.close();
			
		}
		catch (Exception e) {
			System.out.println(e);		}
	}

}
