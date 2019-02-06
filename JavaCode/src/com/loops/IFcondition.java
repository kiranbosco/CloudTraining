package com.loops;
class IFcondition {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int employee =100;
	
		for(int j=45; j<employee-50; j++) {
			System.out.println(j);
		}
		
		System.out.println();
		
		// useing while condition
		
		int k =30;
		while(k<employee-45) {
			System.out.println(k);
			k++;
		}
		System.out.println();
		
		int m =3;
		
		if(m%2==0) {
			System.out.println(" this is the even number");
			
		}
		else {
			System.out.println("this is the odd num");
		}
		
		
		System.out.println();
		
		
		String rev="Nellore";
		char ch[] =rev.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		
		
		
	}
		}
		


