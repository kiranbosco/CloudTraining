package com.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamLongStreamDouble {

	// count the list of data in streams supose if you want calculate the list of emp salary u can fallow like this
	public static int sumOfNumber(	List<Integer> list) {
		return list.stream().reduce(0, (x,y)->x+y);
	}

	// another approch here same exe
	
	public static int sumOfNumberUseIntStream () {
		
	return IntStream.rangeClosed(1, 6) // here is the count the from 1 to 6 number sum
	.sum();
	}
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);	
		System.out.println(sumOfNumber(list));
		
		System.out.println(" second Approch " + sumOfNumberUseIntStream());


		List<String> dup =Arrays.asList("kiran","kumar","bosco","kiran");
		List<String> dupl = dup.stream().sorted().collect(Collectors.toList());
		System.out.println(dupl);

	List<Student> allData =	StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).distinct().collect(Collectors.toList());

		allData.forEach(System.out::println);

		//flatmapper
		System.out.println();

	Long logns =StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().count();
		         System.out.println(logns);


		      Map<String ,Double> listOfMap =   StudentDataBase.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getGpa));
	       	System.out.print(listOfMap);
	}

}

