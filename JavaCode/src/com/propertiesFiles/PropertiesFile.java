package com.propertiesFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("C:\\AVA_TPOINT\\properties");
		Properties p = new Properties();
		p.load(reader);
		System.out.println(p.getProperty("name"));
	}

}
