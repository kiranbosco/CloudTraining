package com.logicalOperator;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int arr[] = {10,52,45,12,3};
		int ar[] = new int[arr.length];
		
		// copy here
		for(int i=0; i<arr.length;i++) {
			
			ar[i] = arr[i];
		}
		// disp 
		
		System.out.println("Original");
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("New Element");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
