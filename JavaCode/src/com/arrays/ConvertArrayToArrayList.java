package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConvertArrayToArrayList {

	// String array convert
	public void convertPrimitive() {

		String [] str = {"kiran","kumar","charan"};
		List<String> list = new ArrayList<>(Arrays.asList(str));

		for(String s : list) {
		//	list.add(String.valueOf(s));

			System.out.println(s);

		}
		System.out.println();

	}

	public void convertArrayToArrayListIntegerVal() {
		// integer array convert


		int ar[] = {10,20,20,10};
		ArrayList<Integer> ll = new ArrayList<>(Arrays.asList(ar.length));
		for(Integer i : ar) {
			ll.add(Integer.valueOf(i));
			System.out.println(i);
		}
		System.out.println();
	}

	public void asListUsingConvert() {

		int ar[] = {13,20,20,10};
		List list =Arrays.asList(ar);

		for(Integer val : ar) {
			System.out.println(val);
		}
		System.out.println();

	}


	public void arrayDuplicates() {
		
		int arr[] = {11,55,11,20,10,45,66,70,70,45};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicates" + arr[i]);
				}
			}
		}
		
	}
	
	// String repeate the charactor
	
	public void sttringRepeateCharactor() {
		
		String content ="AABBCC";
		String contentArr[] = content.split("");
		int count =0;
		HashMap<String, Integer> hs = new HashMap<>();
		for(int z =0; z<contentArr.length;z++) {
			String currentLetter = contentArr[z];
			if(!hs.containsKey(currentLetter)) {
				hs.put(currentLetter, 1);
				count =1;
			}
			else {
				count = count+1;

				hs.put(currentLetter, count);
			}
		}
	
		
		System.out.println( " number of charactors are" + hs);

	}
	
	
	
	public static void main(String[] args) {
		ConvertArrayToArrayList c = new ConvertArrayToArrayList();
		c.convertPrimitive();
		c.convertArrayToArrayListIntegerVal();
		c.asListUsingConvert();
		c.arrayDuplicates();
		c.sttringRepeateCharactor();
	
	}
}
