package com.capgemini.app;

public class App 
{
	private double firstNumber,secondNumber;
	public App(double firstNumber, double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public App() {
	}

	public double addition(double firstNumber,double secondNumber){
		return firstNumber+secondNumber;
	}
	public double subtraction(double firstNumber,double secondNumber){
		return firstNumber-secondNumber;
	}
	public double multiplication(double firstNumber,double secondNumber){
		return firstNumber*secondNumber;
	}
	public double division(double firstNumber,double secondNumber){
		return firstNumber/secondNumber;
	}

}
