package com.loops;

public class ArrayCopyOneToAnother {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,5,2,3,2};
		int ar[] = new int[arr.length];
		
	// copy here 
		for(int i=0; i<arr.length;i++) {
			
			ar[i] = arr[i];
		}
		
		// Original 
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(" Original " + arr[i]);
		}
		
		System.out.println();
		// ocpy 
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i] + " Copy ");
		}

		
		String str ="kiran";
		int s =str.length();
		System.out.println(s);
		
		// FInd the duplicats in array 
		
		System.out.println();
		
		int dup [] = {1,1,2,2,3,3,4,4,5,5,8,8}; 
		
		for(int k =0; k<dup.length;k++) {
			for(int j =k+1; j<dup.length;j++) {
				
				if(dup[k]==dup[j]) {
					System.out.println(dup[j]);
				}
				
			}
			
				
			}
		}
		
	}
	
