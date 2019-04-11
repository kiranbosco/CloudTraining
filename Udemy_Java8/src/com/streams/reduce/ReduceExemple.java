package com.streams.reduce;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExemple {

    public static int performMultiplationOperation(List<Integer> integers){

        return integers.stream().reduce(1,(a,b)->a*b);
    }

    public static Optional<Student>getStudenGpa() {

        return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->{
            if(s1.getGpa()>s2.getGpa()){
                return s1;
            }
            else
                return s2;
        });
    }

    public static Optional<Student> getName(){

        return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->{
            if(s1.getGender().equals("male")&& s2.getGender().equals("female")) {
                return s1;
            }
            else
                return s2;
        });

    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplationOperation(integerList));

        Optional<String> studentList = StudentDataBase.getAllStudents().stream().map(Student::getName).reduce((a, b) -> a + b);
        if (studentList.isPresent()) {
            System.out.println(" I can able to find the val");

        } else {
            System.out.println("sorry i cant able find ur response");

    }
       Optional<Student> studentOptional = getStudenGpa();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
        System.out.println();
        Optional<Student> studentOptional1 =getName();
        if(studentOptional1.isPresent()){
            System.out.println(studentOptional1.get());
        }
        }
    }