package com.serializable;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ISARelationEmpDetails implements Serializable{
	
	String county;
	
	public ISARelationEmpDetails(String country) {

	this.county = country;
	}

}
