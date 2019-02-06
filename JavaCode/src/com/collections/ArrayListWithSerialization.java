package com.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithSerialization {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("kiran");
		list.add("vijay");
		list.add("sujatha");
		list.add("charan");

		try{

			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\text.txt12");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(list);
			oos.close();
			oos.flush();
			fis.close();
			System.out.println("success");
		}
		catch (Exception e) {
			System.out.println(e);		}

		System.out.println(" DSERIALIZATION PROCESS  ");

		try {
			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\text.txt12");
			ObjectInputStream oos = new ObjectInputStream(fis);
			list=(List<String>)oos.readObject();
			System.out.println(list);
			
			System.out.println("data");

			oos.close();
			fis.close();
		}
		catch (Exception e) {
			System.out.println(e);		}

	}

}
