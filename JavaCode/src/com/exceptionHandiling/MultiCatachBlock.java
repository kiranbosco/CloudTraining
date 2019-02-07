package com.exceptionHandiling;

public class MultiCatachBlock {

	public void multicath() {
		try {
			int i =10;
			int k= i/0;

		}catch (ArithmeticException e) {
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();		
		}
		catch (IndexOutOfBoundsException e) {
			e.getMessage();
		}
	}


	public static void main(String[] args) {

		MultiCatachBlock m = new MultiCatachBlock();
		m.multicath();
	}
}