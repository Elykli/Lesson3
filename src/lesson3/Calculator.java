package lesson3;
//perform simple calculation using methods
//declare class calculator
public class Calculator {
	//declare instance variables to store result pf
	private double result;
	
	//declare a method called add - each method describes behavior
	//with two parameters
	public void add(double numberOne, double numberTwo){
		//add value numberOne and numberTwo and storein instance variables
		result = numberOne + numberTwo;
		//display
		System.out.println(numberOne + " + " + numberTwo + " =" + result);
	}//end the body of the method
	public void subtract(double numberOne, double numberTwo){
		
		result = numberOne - numberTwo;
		System.out.println(numberOne + " - " + numberTwo + " =" + result);
	}
	public void divide(double numberOne, double numberTwo){
		
		result = numberOne / numberTwo;
		System.out.println(numberOne + " / " + numberTwo + " =" + result);
	}
	public void multiply(double numberOne, double numberTwo){
		
		result = numberOne * numberTwo;
		System.out.println(numberOne + " * " + numberTwo + " =" + result);
	}
	public static void main(String[] args) {
		//reuse the Calculator class
		//declare a variable of type of Calculator
		Calculator calc;
		calc = new Calculator();
		
		calc.add(12.6, 18.8);
		calc.divide(20, 10);

	}//end main

}//end class
