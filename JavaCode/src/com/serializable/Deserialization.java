package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

// this is the convert the byte stream object into java text object convention ur student class object reference variable put into base class object here type caste has done here
public class Deserialization {

	public static void main(String[] args)throws Exception{

		Student stu = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\text.txt7");
			ObjectInputStream ois = new ObjectInputStream(fis);
			stu  = (Student)ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Convert has been succes");
			System.out.println(stu.id + " " + stu.name + " " + stu.ph );

		}catch (Exception e) {
			System.out.println(e);		}

	}
}