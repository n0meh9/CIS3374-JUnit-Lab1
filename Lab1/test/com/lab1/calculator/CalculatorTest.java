package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals(4, calculator.add(2,2));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(5, calculator.subtract(10,5));
	}
	
	@Test
	public void multiplyTest() {
		assertEquals(25, calculator.multiply(5,5));
	}
	
	@Test
	public void divideTest() {
		assertEquals(5, calculator.divide(25, 5));
	}
	
	@Test
	public void isEqualPositiveTest() {
		assertTrue(calculator.isEqual(5, 5));
	}
	
	@Test
	public void isEqualNegativeTest() {
		assertFalse(calculator.isEqual(3, 6));
	}

}
