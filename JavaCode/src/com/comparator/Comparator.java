package com.comparator;

import java.util.Collections;

public class Comparator implements java.util.Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);

	}

}
