package com.streams;

import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamExample {  

	public static void main(String[] args) throws IOException {
		try {

			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\sample1");
			
			int i =0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);

			
			}
			fis.close();
		
		}

	catch (Exception e) {
		System.out.println(e);		}

}

}



