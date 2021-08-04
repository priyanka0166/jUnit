package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import bussiness.MyMath;

public class MyMathTest {
	MyMath m;
	
	@Before
	public void setUp() throws Exception {
		 m = new MyMath();
	}

	@After
	public void tearDown() throws Exception {
		m = null;
	} 

	@Test
	public void testSum3Numbers() {
		System.out.println("Test 1");
		assertEquals(10, m.sum(new int[] {5, 3, 2 }));
		
	}
	@Test
	public void testSum1Number() {
		System.out.println("Test 2");
		assertEquals(5, m.sum(new int[] {5}));
	}

}
