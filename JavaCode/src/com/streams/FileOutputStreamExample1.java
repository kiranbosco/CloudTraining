package com.streams;

import java.io.FileOutputStream;


// java io streams is used to given input data and produce the out put response data we can us the file stream is java Output stream use in method write() and close()
public class FileOutputStreamExample1 {
	public static void main(String[] args) {
		
	try {
		
		FileOutputStream fos  = new FileOutputStream("C:\\StreamsFiles\\sample1");
		String str ="Java FileOutputStream is an output stream used for writing data to a file.\r\n" + 
				"\r\n" + 
				"If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.\r\n" + 
				"\r\n" + 
				"";
		byte[] b = str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("success ");
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}

}
