package com.udimy.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class BiconsumerExe {
	
// using the biconsumer call the student activities and names
	public static void getAllActivities() {

		BiConsumer<String, List<String>> studentBioConsumer =(name ,activities) ->{
			System.out.println(name +  " " + activities);
		};
		List<Student> students =StudentDataBase.getAllStudent();
		students.forEach(stu-> studentBioConsumer.accept(stu.getName() ,  stu.getAactivities()));
		System.out.println();

		
    }
	
	public static void printAllNameUpperCase() {

		BiConsumer<String, List<String>> getToUperCaseName =(name ,activities) ->{
			System.out.println(name +  " " + activities);
		};
		List<Student> students =StudentDataBase.getAllStudent();
		students.forEach(stu ->getToUperCaseName.accept(stu.getName().toUpperCase(), stu.getAactivities()));

		System.out.println();

	}

	public static void filtringGrade() {
		
		/*
		 * BiConsumer<Student, Integer> gradeLevelInfo =(name ,gradeLevel)->{
		 * System.out.println(name + " " + gradeLevel); }; List<Student> getFiltringData
		 * = StudentDataBase.getAllStudent(); getFiltringData.forEach(stu->{
		 * if(stu.getGradeLevel()>=3) { gradeLevelInfo.accept(stu,null); } });
		 */
		
		 Consumer<Student> c7=(stu)->System.out.println(stu.getName() + " "+stu.getGradeLevel());
		 List<Student> getFiltringGradeLevel =StudentDataBase.getAllStudent();
		 getFiltringGradeLevel.forEach(stu ->{
			 if(stu.getGradeLevel()>=3) {
				 c7.accept(stu);
			 }
		 });
		}
	
	public static void main(String[] args) {
		
		BiConsumer<String, String> biconsumer =(a ,b)->{	
			System.out.println(a + " " + b);
		};
		biconsumer.accept("Java 7", "Java 8");
		
		// we have to perfome some Number Operations
		
		BiConsumer<Integer ,Integer> multiply =(a,b)->{
			System.out.println("Multiply" + " "+ a*b);
		};
		BiConsumer<Integer, Integer> division =(a, b)->{
			System.out.println("division" + " " + a/b);
			
			System.out.println();

		};

		multiply.andThen(division).accept(10, 5);
		getAllActivities();
		printAllNameUpperCase();
		filtringGrade();
		
	}
}
