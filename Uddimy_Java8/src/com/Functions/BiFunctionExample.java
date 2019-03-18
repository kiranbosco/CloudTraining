package com.Functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.udimy.consumer.ConsumerExe;
import com.udimy.consumer.Student;
import com.udimy.consumer.StudentDataBase;
import com.udimy.predicate.PredicateStudentExe;
public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String , Double>> biFucntion =(student , pridicateStu)->{
		Map<String , Double> stuMap = new HashMap();
		student.forEach(stu->{
			if(pridicateStu.test(stu)) {
				stuMap.put(stu.getName(), stu.getGpa());
			}
		});
		return stuMap;
	};

	static BiFunction<List<Student>, Predicate<Student>, Map<String , String>> names =(stuName , stuBiGender)->{
		Map<String , String> hasName = new HashMap();
		stuName.forEach(j->{
			if(stuBiGender.test(j)) {
				hasName.put(j.getName(), j.getGrender());
			}
		});
		return hasName;

	};



	public static void main(String[] args) {

		System.out.println(biFucntion.apply(StudentDataBase.getAllStudent(), PredicateStudentExe.getGpaGradeLevelAndMethod()));
		System.out.println(names.apply(StudentDataBase.getAllStudent(), PredicateStudentExe.pridicateFiltringGrade()));
	}

}
