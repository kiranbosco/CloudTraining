package com.udimy.consumer;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int gradeLevel;
	private double gpa;
	private String grender;

	public Student(String name, int gradeLevel, double gpa, String grender, List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.grender = grender;
		this.activities = activities; // Here is we call the has a relations ship  list of activities
	}

	public Student(String name2, double d, int gpa2, String grender2, List<String> asList) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getGrender() {
		return grender;
	}

	public void setGrender(String grender) {
		this.grender = grender;
	}
	public List<String> getAactivities() {
		return activities;
	}

	public void setAactivities(List<String> aactivities) {
		this.activities = aactivities;
	}
	List<String> activities = new ArrayList<>();

	@Override
	public String toString() {
		return "Student [name=" + name + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa + ", grender=" + grender + "]";
	}
}
	
