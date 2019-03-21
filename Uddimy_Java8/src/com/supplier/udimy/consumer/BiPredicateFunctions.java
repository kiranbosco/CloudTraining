package com.udimy.consumer;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateFunctions {

	Predicate<Student> p1 =(s)->s.getGradeLevel()>=3;
	Predicate<Student> p2 = (s)->s.getGpa()>=3.2;
	BiPredicate<Integer, Double> biPredicate =(gpa,gradeLevel)->gpa>=3 && gradeLevel>=3.5;

Consumer<Student> students1 =(students)->{
	
	if(biPredicate.test(students.getGradeLevel(), students.getGpa()));
	
};
	public void getBiPredicateFun(List<Student> students) {

		students.forEach(students1);
	}

	public static void main(String[] args) {

		List<Student> getAllStuData =StudentDataBase.getAllStudent();
		BiPredicateFunctions biF = new BiPredicateFunctions();
		biF.getBiPredicateFun(getAllStuData);
	}

}
