package com.Functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import com.udimy.consumer.Student;
import com.udimy.consumer.StudentDataBase;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String ,Double>>
	studentFunction=(students->{ Map<String , Double> studentGpa = new HashMap();
	students.forEach((stu->{ studentGpa.put(stu.getName(), stu.getGpa()); }));
	return studentGpa;
	});
	
	static Function<List<Student>, Map<String ,Integer>> listOf =(act->{
		Map<String ,Integer> map = new HashMap();
		act.forEach(list ->{
			map.put(list.getName(), list.getGradeLevel());
		});
		return map;
	});

	/*
	 * static Function<List<Student>, Map<String ,String>> listOfAct =(listOf->{
	 * Map<String, String> activities = new HashMap(); 
	 * listOf.forEach(ll ->{
	 * activities.put(ll.getAactivities(), ll.getName()); });
	 * 
	 * return activities; }) ;
	 */

	public static void main(String[] args) {

		System.out.println(studentFunction.apply(StudentDataBase.getAllStudent()));
		System.out.println(listOf.apply(StudentDataBase.getAllStudent()));

	}

}
