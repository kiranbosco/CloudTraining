package com.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingNum {
	public static void main(String[] args) {
		List<String> listStrings = Arrays.asList("Orange", "Grape", "Apple", "Lemon", "Banana");

		System.out.println("Before sorting: " + listStrings);

		//Collections.sort(listStrings);
		Collections.sort(listStrings);

		System.out.println("After sorting: " + listStrings);

}
}