package com.collectionLambdaExpressions;

public class Employee {

	private int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", sal=" + sal + "]";
	}
	private String fName;
	private String lName;
	private int sal;

	/*
	 * public Employee(int id, String fName, String lName, int sal) { super();
	 * this.id = id; this.fName = fName; this.lName = lName; this.sal = sal; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

}
