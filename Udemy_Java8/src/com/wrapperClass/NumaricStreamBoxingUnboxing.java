package com.wrapperClass;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumaricStreamBoxingUnboxing {

		public static List<Integer> boxingexe(){

			return IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList()); 
		}
		public static int unBoxingVal(List<Integer> listofVal) {
			
			return listofVal.stream().mapToInt(Integer::intValue).sum();
		}
		
		public static void main(String[] args) {
			System.out.println(boxingexe());
			
			List<Integer>list =boxingexe();
			System.out.println(unBoxingVal(list));
			
			
		
		}
}