package com.compareTo;

import java.util.Comparator;


	public class CompareYear implements Comparator<ComparatorExe> {

		@Override
		public int compare(ComparatorExe obj1, ComparatorExe obj2) {

			if(obj1.year == obj2.year) {
				return 0;
			}
			else if(obj1.year > obj2.year) {
				return 1;
			}
			else
			return -1;
		}
	

		
	}
	
/*	Conclusion :- this comparable interface is consist one method comparaTo we can implement the 
	comparable interfae 
	
	comparator consist compare method it will provided two method object one is compare to object tow 
	*/