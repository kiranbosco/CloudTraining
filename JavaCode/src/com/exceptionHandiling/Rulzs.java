package com.exceptionHandiling;

import java.io.IOException;
import java.sql.SQLException;

public class Rulzs {
	
 public void m() throws IOException{
	 
	 System.out.println(" this  is the super class");
 }

}
class Rulz1 extends Rulzs{
	
	public void m() throws IOException {
		
		System.out.println(" if we mention base class exception it will be applicable for derived class also " );
	}

}
