package com.unit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DemoTest {
	
	/*
	 * @Test public void compateStirngTest() {
	 * 
	 * Demo demo = new Demo(); assertTrue(demo.compareToString("kiran", "kiran"));
	 * 
	 * }
	 */
	
	/*
	 * @Test public void concatStirngTest() {
	 * 
	 * Demo demo = new Demo(); assertEquals("HelloWorld", demo.concatStirng("Hello",
	 * "World")); }
	 */

	
	@Test
	public void addOneValTest() {
		
		Demo demo = new Demo();
		int arr[] = new int[] {5,7};
		assertArrayEquals(arr, demo.addOneVals(new int[] {3,5}));
	}
	
	}
