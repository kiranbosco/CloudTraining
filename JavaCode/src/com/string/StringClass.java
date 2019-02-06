package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// java string equals method will be cheking content and operaror will be cheking the reference
public class StringClass  {
	public static void main(String[] args) {

		String s = new String("kiran");
		String s1 =new String ("kiran");

		String s2 ="kiran";
		String s3 ="kiran";

		boolean s4 =s.equals(s1);
		System.out.println(s4);

		boolean s5 =s2.equals(s3);
		System.out.println(s5);

		boolean s6 =s.equals(s3);
		System.out.println(s6);

		boolean s7 =s==s3;
		System.out.println(s7);

		// java reverse program

		String rev="Nellore";
		char ch[] =rev.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		// chara
		char chs[] = {'h','b','k'};
		String shs = new String(chs);
		System.out.println(shs);

		//charAt method will be determine the index of char value
		String ind ="javaNotes";
		char chj=ind.charAt(4);
		System.out.println(chj);

		//charAt lenght find here odd number

		String strj ="welcome to purini";
		for(int i=0;i<strj.length()-1;i++) {
			if(i%2!=0) {
				System.out.println(i + " oddNumbers");
			}
			System.out.println();
		}

		// print the even num
		String num ="BoscoPurini";
		for(int i=0;i<num.length();i++) {
			if(i%2==0) {
				System.out.println(i + "EvenNumber");
			}
		}

		// isEmpty method in java
		String emp ="";
		boolean gg =emp.isEmpty();
		System.out.println(gg);

		// Concatnation method it can be using to adding oddin one one object to another object in java  here we are using either concat() or + operator

		String p ="purini";
		String k =" charan";
		String g =" Hemmaja";

		String t =p.concat(k).concat(g);
		System.out.println(t);

		String con = p + k + g;
		System.out.println(con);

		// contain method() this will be serching wether the given object is there or not

		String co ="i am cloudFx employee designation in software engineer";
		boolean bs =co.contains("designation");
		boolean sk =co.contains(" puurini");
		System.out.println(bs);
		System.out.println(sk);

		String che ="cloudFx";
		if(che.contains("kiran")) {
			System.out.println("obect is there");
		}
		else {
			System.out.println("sorry");
		}

		// endWith method() if ur given index value if right or rong it will be checking
		String end ="xcvbnm,asdfghjklwertyu";
		boolean en= end.endsWith("t");
		System.out.println(en);



		String endw ="kiran";
		if(endw.endsWith("k")) {
			System.out.println("it is there");
		}
		else {
			System.out.println("i am not");
		}

		//starsWith this method will be checking if ur given start val if correct or not

		String strt ="kiran bosco";
		if(strt.startsWith("K")) {
			//	if(strt.equalsIgnoreCase("k")) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

		// equals() eqals method will be checking the content and == operaor will be checking the reference
		String eq ="kiran";
		String eqS ="KIRAN";
		if(eq.equals(eq)) {
			System.out.println("yes");
		}
		else {
			System.out.println("na");
		}

		// here is checking content not inside the content
		String e ="kiran";
		String es ="kiran";
		if(e == es) {
			System.out.println("i am in here");
		}
		else {
			System.out.println("i am not");
		}

		//getCharArray method()

		String str = new String("Welcome to Javatpoint");  
		char[] chf  = new char[20];  
		try {  
			str.getChars(1, 20, chf, 0);  
			System.out.println(chf);  
		} catch (Exception e1) {  
			System.out.println(e1);  
		}  

		// this method is used for get content of selected data inside the string 
		String sts ="Welcome to Javatpoint";
		char chp [] =new char[22];
		sts.getChars(5, 10, chp, 0);
		System.out.println(chp);

		String sps ="kiran";
		char oo[] =sps.toCharArray();
		for(int i=oo.length-1;i>=0;i--) {
			System.out.print(oo[i]);
			System.out.println();
		}


		// getCharMehto()

		String response ="java get reponse payload";
		char[] hp = new char[24];
		response.getChars(6, 20, hp, 0);
		System.out.println(hp);

		//char index()

		String indx ="hello welcome to java";
		int intx =indx.indexOf("l");
		System.out.println(intx);
/*
		  intern method alway return the same content in java
			         when ur create the object with new keyword it will be storing the  heap memory
			         and when ur create the object double quets it will be create the object in constant pool area
		 */

		String v ="welcome";   // this will be storing an object in constant pool

		String sv =new String("welcome"); // this will be storing an object in to heap memory
		String svv =v.intern();

		String sm =v.intern();
		System.out.println(v==sv);
		System.out.println(v==sm);

		// Join method() in java

		String jos =String.join("-", "krian","kumar");
		System.out.println(jos);

		List<String> list = new ArrayList<>();
		list.add("kiran");
		list.add("vijay");
		list.add("sujatha");

		String jpg =String.join("||", list);
		System.out.println(jpg);
		

		List<String> ll = new ArrayList<>();
		ll.add("charan");
		ll.add("Nandhini");
		ll.add("varshini");
		ll.add("Heemaja");
		ll.add("srilakshmi");
		String jsn =String.join("@gmail.com ", ll);
	
		System.out.println(jsn);

		// find the index value number
		String indxv ="javaIndexValue";
		int idx =indxv.lastIndexOf("I");
		System.out.println(idx);

		String repl ="I am not robotech";
		String re =repl.replace("a", "A");
		System.out.println(re);
		
		
		// java split method is split the word until given index reference
		
		String splt ="java is very is very is very is very is very is";
		String[] spt =splt.split("\\s");
		for(String ss : spt) {
			System.out.println(ss);
			System.out.println();
			
			//SubString it will be pass the string valeut to substring 
			
			String stt ="javaTpoint";
			String skt =stt.substring(2, 10);
			System.out.println(skt);

	
			//trim() this method is usd for the trim object leading and triling white spaces in java
			
			String jpot ="   java T Point         ";
			String pot =jpot.trim();
			System.out.println(pot);
			
			// ValueOf this method is conver the string objec to another primitive data type
			
			String vas ="1000";
			int ij =Integer.valueOf(vas);
			System.out.println(ij);
			
			int ji =2000;
			String jit =String.valueOf(ji);
			System.out.println(jit);
			
			char cval ='A';
			String sval =String.valueOf(cval);
			System.out.println(sval);
			
			// getChar method;
			
			String getC = "kiran kumar";
            			
			char[] ggs =new char[20];
			getC.getChars(2, 10, ggs, 0);
			System.out.println(ggs);

			
			
		}
		
}


}


