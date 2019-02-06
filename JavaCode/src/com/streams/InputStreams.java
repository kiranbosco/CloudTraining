package com.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class InputStreams {

	public static void main(String[] args) {
		try {

			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\txt2");
			BufferedInputStream bs = new BufferedInputStream(fis);
			
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
			bs.close();
			System.out.print("suscess ");
		
		}
		catch (Exception e) {
			System.out.println(e);		}
	}

}
