package com.exceptionHandiling;

public class FinalAndFinallyAndFinalize {

	public static void main(String[] args) {

		// final Example can't be change the value
		final int x =100;
	//	x =200;
		
		// finally it is the block
		
		try {
			int t =100;

		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("this block is alway excuted");
		}
		
		// finalize method
		
		
		FinalAndFinallyAndFinalize f = new FinalAndFinallyAndFinalize();
		FinalAndFinallyAndFinalize ff = new FinalAndFinallyAndFinalize();
		f=null;
		ff = null;
		System.gc();
				
		
		
	}
}
