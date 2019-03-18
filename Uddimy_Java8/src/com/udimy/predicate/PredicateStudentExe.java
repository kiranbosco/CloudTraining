package com.udimy.predicate;

import java.util.List;
import java.util.function.Predicate;
import com.udimy.consumer.Student;
import com.udimy.consumer.StudentDataBase;

@SuppressWarnings("unused")
public class PredicateStudentExe {

	static Predicate<Student> p =(s)->s.getGradeLevel()>=2;
	static Predicate<Student> p1 =(t)->t.getGpa()>=3.5;
	
	
	
	public static Predicate<Student> pridicateFiltringGrade() {

		List<Student> students =StudentDataBase.getAllStudent();
		students.forEach((stu->{
			if(p.test(stu)) {
				System.out.println(stu);
			}
			
		}));
		
		System.out.println();
		return p;
	}
	
	public static void getGpa() {
		
		List<Student> studentGpa =StudentDataBase.getAllStudent();
		studentGpa.forEach((stu->{
			
			if(p1.test(stu)) {
				System.out.println(stu);
			}
		}));
		System.out.println();

	}
	
	public static Predicate<Student> getGpaGradeLevelAndMethod() {
		
		List<Student> getAll = StudentDataBase.getAllStudent();
		getAll.forEach((stu->{
		if(p.and(p1).test(stu)) {
			System.out.println(stu);
		}
		}));
		
		System.out.println();
		return p;

	}
	
	public static Predicate<Student> getGpaGradeLevelOrMethod() {
	
		List<Student> getsAll=StudentDataBase.getAllStudent();
		getsAll.forEach((stu ->{
			if(p.or(p1).negate().test(stu)) {
				System.out.println(stu);
			}
		}));
		System.out.println();
		return p;
	}
	
	public static Predicate<Student> getGpaGradeLeveNegaterMethod() { //  who is the not matching condition
		
		List<Student> notMatching =StudentDataBase.getAllStudent();
		notMatching.forEach((stu->{
			if(p.or(p1).negate().test(stu)) {
				System.out.println(stu);
			}
			else
				System.out.println(stu);
		}));
		return p;
	}
	public static void main(String[] args) {
		pridicateFiltringGrade();
		getGpa();
		getGpaGradeLevelAndMethod();
		getGpaGradeLevelOrMethod();
		getGpaGradeLeveNegaterMethod();
	}

}


