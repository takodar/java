package com.staples.calc.helpers;

import org.junit.*;

import static org.junit.Assert.*;


public class MathHelperTest {

	@Test
	public void testAddValues() {
		double testVal = MathHelper.addValues("8.25", "4.0");
		assertEquals(12.25, testVal, .01);
	}

	@Test
	public void testMultiplyValues() {
		double testVal2 = MathHelper.multiplyValues("22", "2");
		assertEquals(44, testVal2, .01);
	}
}
