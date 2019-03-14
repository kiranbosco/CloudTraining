package com.Functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.udimy.consumer.Student;
import com.udimy.consumer.StudentDataBase;

public class FunctionStudentExample {

		
 static Function<List<Student>, Map<String, Double>> studentMap =(students ->{
	 Map<String ,Double> studentInfo =new HashMap();
	 students.forEach(stu->{
		 studentInfo.put(stu.getName(), stu.getGpa());
	 });
	 return studentInfo;
 });
	public static void main(String[] args) {
		System.out.println(studentMap.apply(StudentDataBase.getAllStudent()));
		

	}

}
