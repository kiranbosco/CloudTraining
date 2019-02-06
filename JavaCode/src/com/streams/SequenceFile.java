package com.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceFile {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\txt3");
			FileInputStream ffs = new FileInputStream("C:\\StreamsFiles\\txt4");

			SequenceInputStream sq = new SequenceInputStream(fis, ffs);
			int i =0;
			while((i=sq.read())!=-1) {
				System.out.print((char)i);
			}
			sq.close();
			fis.close();
			ffs.close();

		}
		catch (Exception e) {
			System.out.println(e);		}
	}

}
