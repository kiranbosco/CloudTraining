package com.cuppling;

// loose cuppling will not depends on another class  we can implimented n number of class in run time 
public class LooseCuppling implements Loose{

	@Override
	public void looseCupling() {
		
		System.out.println("starting loose cuppling");
	}

	class LoseCuppling1 implements Loose{

		@Override
		public void looseCupling() {
			
			System.out.println("it is loose cuppling working");
			
		}
		class LoseCuppling2 implements Loose{

			@Override
			public void looseCupling() {
				
				System.out.println("it is loose cuppling working");
				
			}
	}
}
}
