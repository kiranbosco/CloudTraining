package com.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\StreamsFiles\\sample");
			fos.write(65);
			fos.close();
			System.out.println("success");

		}
		catch (Exception e) {
			System.out.println(e);	
		}
	}

}
