package com.capgemini.app;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private static Logger logger = Logger.getLogger(App.class.getName());

	static {
		BasicConfigurator.configure();
	}
		
	@Test
	public void additionTest() {
		App calculator = new App();
		double actual =calculator.addition(10.26, 3.26);
		double expected=13.52;
		logger.info("Addition of two positive numbers :"+actual);
		assertEquals(expected, actual,0);
	}
	@Test
	public void negativeAdditionTest() {
		App calculator = new App();
		double actual =calculator.addition(-1, -3.26);
		double expected=-4.26;
		logger.info("Addition of two negative numbers :"+actual);
		assertEquals(expected, actual,0);
	}
	@Test
	public void zeroNegativeAdditionTest() {
		App calculator = new App();
		double actual =calculator.addition(0, -3.26);
		double expected=-3.26;
		logger.info("Addition of zero and negative numbers : "+actual);
		assertEquals(expected, actual,0);
	}
	
	@Test
	public void subtractionTest() {
		App calculator = new App();
		double actual =calculator.subtraction(10.26, 3.26);
		double expected=7.0;
		logger.info("Subtraction of two positive numbers : "+actual);
		assertEquals(expected, actual,0);
	}
	@Test
	public void multiplicationTest() {
		App calculator = new App();
		double actual =calculator.multiplication(10.26, 3.26);
		double expected=33.447599999999994;
		logger.info("Multiplication of two numbers"+actual);
		assertEquals(expected, actual,0);
	}
	@Test
	public void divisionTest() {
		App calculator = new App();
		double actual =calculator.division(10.26, 3.26);
		double expected=3.147239263803681;
		logger.info("Division of two numbers : "+actual);
		assertEquals(expected, actual,0);
	}
	
}
