package com.udimy.consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class StudentDataBase {
	
	//sisngle student data retrive here
	
	public static Supplier<Student> studentSupplier = ()->{
	return new Student("kiran", 2, 3.7, "male",Arrays.asList("swimming","baketbal","valleybal"),Arrays.asList("java","Microservices","mysql"));
	
	};
	
	public static List<Student> getAllStudent(){
		
		Student student1 = new Student("kiran", 2, 3.7, "male",Arrays.asList("swimming","baketbal","valleybal"),Arrays.asList("java","Microservices","mysql"));
		Student student2 = new Student("vijay", 3, 3.9, "male",Arrays.asList("swimming","baketbal","valleybal"),Arrays.asList("php","dotNet","mysql"));
		Student student3 = new Student("sujatha", 4, 3.3, "female",Arrays.asList("Cooking","throwbal","shatil"),Arrays.asList("sterling","java","mysql"));
		Student student4 = new Student("Heemaja", 5, 3.2, "female",Arrays.asList("Cooking","sketing","indoorGames"),Arrays.asList("phytan","Microservices","mysql"));

		List<Student> student = Arrays.asList(student1,student2,student3,student4);
		return student;
		
	}

}
