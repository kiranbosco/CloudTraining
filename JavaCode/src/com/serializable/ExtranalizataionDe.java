package com.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExtranalizataionDe {

	public static void main(String[] args) {

		User u = null;
		try {

			FileInputStream fis = new FileInputStream("C:\\StreamsFiles\\text.txt11");
			ObjectInputStream oos = new ObjectInputStream(fis);
			u =(User)oos.readObject();
			System.out.println();
		}catch (Exception e) {
			System.out.println(e);		}
	}

}
