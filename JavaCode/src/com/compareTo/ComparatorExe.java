package com.compareTo;


public class  ComparatorExe  {
	
	
	int year;
	@Override
	public String toString() {
		return "ComparatorExe [year=" + year + ", name=" + name + ", rating=" + rating + "]";
	}

	String name;
	double rating;
	
	public ComparatorExe(int year, String name,double rating) {
		this.year =year;
		this.name = name;
		this.rating = rating;

}
	

}