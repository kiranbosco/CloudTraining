package com.wrapperClass;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToObjectExe {

	// this mapToObj method will be convert the list of stream objects like this[1,2,3,4,5]
	public static List<Integer> mapToObjectExe(){
		return IntStream.rangeClosed(1, 5).mapToObj(i->{
			return new Integer(i);
		})
				.collect(Collectors.toList());
	} 

	//  this method will be cover the long list of stsream object like this [5,6,7,8,9,10]
	public static List<Long> maptToObjeLongExe(){
		return LongStream.rangeClosed(5, 10).mapToObj(j->{
			return new Long(j);
		}).collect(Collectors.toList());
	}

	//Double stream exe  results [65.0]	
	
	public static double mapToDoubleExe(){
		
		return IntStream.rangeClosed(11, 15).mapToDouble((i)->i).sum();	
				
	}
	public static void main(String[] args) {

		System.out.println("mapToObjectExe "  + mapToObjectExe());
		System.out.println("maptToObjeLongExe " + maptToObjeLongExe());
		System.out.println( "mapToDoubleExe" + mapToDoubleExe());
	}
}
