package com.streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BuffredStreams {
	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("C:\\StreamsFiles\\txt4");
			BufferedOutputStream bs = new BufferedOutputStream(fos);
			String  str ="java is very good technology";
			byte[] b =str.getBytes();
			bs.write(b);
			bs.close();
			fos.close();
			fos.flush();
			System.out.println("success");

		}catch (Exception e) {
			System.out.println(e);		
		}
	}

}
