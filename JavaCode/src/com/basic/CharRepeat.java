package com.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharRepeat {

	public void charRepeat() {

		String str ="AABBCC";
		String [] spl =  str.split("");
		int count = 0;
		HashMap<String, Integer> hs = new HashMap<>();
		for(int i=0; i<spl.length;i++) {

			String currentLetter = spl[i];
			if(!hs.containsKey(currentLetter)) {
				hs.put(currentLetter, 1);
				count =1;
			}
			else {
				count = count +1;
				hs.put(currentLetter, count);
						}
		}
		System.out.println(hs);
	}
	
	public void duplicates() {
		
		List<String> list = new ArrayList<>();
		list.add("kiran");
		list.add("charan");
		list.add("kiran");

		list.add("vijay");
		
		ArrayList<String> name = new ArrayList<>();
		for(String emp : list) {
			
			if(!name.contains(emp)) {
				name.add(emp);
				}
		}
		for(String s : name) {
			System.out.println(s);
		}
	}
		
		public void reverse() {
			
			String st ="bosco";
			char ch[] = st.toCharArray();
			for(int i=ch.length-1; i>=0; i--) {
				System.out.print(ch[i]);
			}
		}
		public void duplicateNum() {
			ArrayList<Integer> num = new ArrayList<>();
			num.add(10);
			num.add(20);
			num.add(10);
			
			ArrayList<Integer> val = new ArrayList<>();
			for(Integer fn : val) {
				
				if(!val.contains(num)) {
					val.add(fn);
				}
			}
			for(Integer ing : val) {
				System.out.println(ing);
			}
		}
	
	public static void main(String[] args) {
		
		CharRepeat c = new CharRepeat();
		c.charRepeat();
		c.duplicates();
		c.reverse();
		c.duplicateNum();
		
	}

}
