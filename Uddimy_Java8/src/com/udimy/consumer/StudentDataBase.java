package com.udimy.consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class StudentDataBase {
	
	public static List<Student> getAllStudent(){
		
		Student student1 = new Student("kiran", 2, 3.7, "male",Arrays.asList("swimming","baketbal","valleybal"));
		Student student2 = new Student("vijay", 3, 3.9, "male",Arrays.asList("swimming","baketbal","valleybal"));
		Student student3 = new Student("sujatha", 4, 3.3, "female",Arrays.asList("Cooking","throwbal","shatil"));
		Student student4 = new Student("Heemaja", 5, 3.2, "female",Arrays.asList("Cooking","sketing","indoorGames"));

		List<Student> student = Arrays.asList(student1,student2,student3,student4);
		return student;
		
	}

}
