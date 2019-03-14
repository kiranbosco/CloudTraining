package com.udimy.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    Consumer<Student> studentConsumer = (student) -> {
    	
    	List<Student> list =StudentDataBase.getAllStudent();
    	

        if(p1.and(p2).test(student)){
            studentBiConsumer.accept(student.getName(),student.getAactivities());
        list.forEach(s->{
        if(s.getGradeLevel()>=2.5 && s.getGpa()>=2) {
        System.out.println(s);
        }
        });
        }
    };

    public void printNameandActivities(List<Student> studentList){

        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudent();

        new PredicateAndConsumerExample().printNameandActivities(studentList);

    }
}