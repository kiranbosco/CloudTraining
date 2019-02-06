package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationWithTransientKey {

	public static void main(String[] args) {

		TransientKey t = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\text.txt10");
			ObjectInputStream oos = new ObjectInputStream(fis);
			t =(TransientKey)oos.readObject();
			System.out.println("success");
			System.out.println(t.age + " "+ t.id + " "+ t.name);
			oos.close();
			fis.close();
			
		}
		catch (Exception e) {
			System.out.println(e);		}
	}

}
