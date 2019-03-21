package com.udimy.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExe {

	static Consumer<Student> c2 =(stu)->System.out.println(stu);
	static Consumer<Student> c3 =(stus)->System.out.println(stus.getAactivities());
	static Consumer<Student> c4 =(stus)->System.out.println(stus.getName());
	static Consumer<Student> c5 =(stu)->System.out.println(stu.getGpa() + " " + stu.getGrender());
	static Consumer<Student> c6 =(stu)->System.out.println(stu.getGpa() + " " + stu.getAactivities() + " "+ stu);
	static Consumer<Student> c7=(stu)->System.out.println(stu.getName() + " "+stu.getGradeLevel());
	static Consumer<Student> c8 =(stu)->System.out.println(stu.getGradeLevel() + " " + stu.getAactivities());

	public static void printName() {

		List<Student>studentList=StudentDataBase.getAllStudent();
		studentList.forEach(c2);

		System.out.println();
	}

	public static void getNamesActivities() {

		List<Student> studentList1 =StudentDataBase.getAllStudent();
		studentList1.forEach(c3.andThen(c4));//consumer Chaining it will take the more then one task and perform operations
		System.out.println();
	}
	public static void getGpaGender() {

		List<Student> sutdeList2 =StudentDataBase.getAllStudent();
		sutdeList2.forEach(c5);
		System.out.println();
	}

	public static void filtringValues() {

		List<Student> getFiltring =StudentDataBase.getAllStudent();
		getFiltring.forEach(stu->{
			if(stu.getGradeLevel()>=3) {
				c7.accept(stu); 
			}
		});

		System.out.println();

		List<Student> filtringActivities =StudentDataBase.getAllStudent();
		filtringActivities.forEach(stu->{
			if(stu.getGradeLevel()>=3) {
				c8.accept(stu);
			}
		});
		System.out.println();
	}
	public static void getUpperCaseNames() {

		Consumer<Student> c9=(stu)->System.out.println(stu.getName().toUpperCase());
		List<Student> filtringUperCaseNames =StudentDataBase.getAllStudent();
		filtringUperCaseNames.forEach(c9);	
		System.out.println();
	}

	public static void main(String[] args) {


		// It can take some input orgment and pefrorm some operation it is never going to be return anything
		Consumer<String> c1 = (s)->System.out.println(s.toUpperCase());
		c1.accept("Hello Java 8");
		c1.accept("Hello Java 7");
		printName();
		getNamesActivities();
		getGpaGender();
		filtringValues();
		getUpperCaseNames();
	}

}
