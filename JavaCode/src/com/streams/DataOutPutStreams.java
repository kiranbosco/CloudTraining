package com.streams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// DataOutPutStream is used allocate the primitive data from the input stream in mechanism independently a way 

public class DataOutPutStreams {
	public static void main(String[] args) {

		try {
			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\txt5");
			DataOutputStream dos = new DataOutputStream(fis);
			dos.writeInt(55);
			dos.close();
			dos.flush();
			System.out.println("success");
		}catch (Exception e) {
			System.out.println(e);	}
	}
}
