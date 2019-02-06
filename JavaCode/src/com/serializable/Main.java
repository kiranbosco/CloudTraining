package com.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Student s = new Student(10, "charan", 817906);
		try {
			
			FileOutputStream fis = new FileOutputStream("C:\\StreamsFiles\\text.txt7");
            ObjectOutputStream out = new ObjectOutputStream(fis);
            out.writeObject(s);
            out.close();
            fis.close();
            System.out.println("success");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println(" SERIALIZATION WITH INHERITANCE IS A RELATIONSHIP    ");
		
		
				Person p = new Person(10, "Heemaja", "java", 70000);
				
				try {
					FileOutputStream fos = new FileOutputStream("C:\\StreamsFiles\\text.txt8");
					ObjectOutputStream obs = new ObjectOutputStream(fos);
					obs.writeObject(p);
					obs.close();
					fos.close();
					System.out.println("success");
				}
				catch (Exception e) {
					System.out.println(e);		
					}

			}
		
}
