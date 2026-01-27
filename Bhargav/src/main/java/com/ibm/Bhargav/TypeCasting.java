package com.ibm.Bhargav;

public class TypeCasting {
	public static void main(String[] args) {
		
		// implicit type casting 
		int num1 = 2000;
		double num2 = 3000.55;
		double sum = num1 + num2;
		// int sum1 = num1 + num2; // error because double to int not possible 
		System.out.println("Sum of "+num1+" and "+ num2+" is "+sum);
		
		//explicit type casting 
		double doubleNum = (double)num1;

		System.out.println("The value of " + num1 + " after converting to the double is " + doubleNum);
		
		// Type casting double to int
		 int convertedInt =(int) doubleNum; 
		
		System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);
		}
}


/*
 * Type casting: 1. Implicit type casting 2. Explicit type casting
 * implicit type casting :
 * in which a smaller type is converted into a larger type, but not from large to small 
 * it is done by the compiler automatically.
 * byte>short>char>int>long>float>double
 * 
 * explicit type conversion:
 *  which is done by the programmer manually.
 * 
 * desired_type target variable  = (desired type) source variable ;
 * 
 *  In this type casting a larger type can be converted into a smaller type.
 */
