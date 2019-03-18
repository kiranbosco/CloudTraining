package com.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.udimy.consumer.Student;
import com.udimy.consumer.StudentDataBase;

/*it is similar to consumer interface consumer interface can take the input never return any out put
but supplier can never take input but its give to out put*/

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Student> stu=()->{
			return new Student("kiran", 2, 3.7, "male",Arrays.asList("swimming","baketbal","valleybal"));
		};
		System.out.println(stu.get());
		
		// Achive List of students data
		// it is never take any input 
		Supplier<List<Student>> supplierList=()->StudentDataBase.getAllStudent();
		System.out.println(supplierList.get());
		
		
		
	};
	}

