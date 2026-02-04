package com.ibm.Bhargav;

public class AutoBoxing {

	public static int add5(int number) {
		return number + 5;
	}

	public static Integer reduce5(Integer num) {
		return num-5;
	}
	
	public static void main(String[] args) {

//	auto boxing changing the primitive data type to its wrapper object by compiler
//	1. autoboxing occurs when we assign a primitive data type to wrapper object 
//	2. when we pass primtive data type to method which takes Wrapper object 

		int i = 10;

//	auto boxing
		Integer obj = i;
		System.out.println(obj);
//	explicit casting of int 5 to obj1
		
		Integer obj2 = Integer.valueOf(5);
		System.out.println(obj2);
//		add5(int) passing Integer object 
		Integer int1 = Integer.valueOf(12);
		System.out.println("the value after adding 5 to Integer object: " + add5(int1));

//	char c = 'B';
		Character ch = 'B';
		System.out.println(ch);

//	auto unboxing is when wrapper object is converted into its primitive type by compiler

		Integer wInt = 50;

//	Auto unboxing
		int pInt = wInt;
		System.out.println(pInt);
		
//		reduce5(Integer) passing int object 
		int num1 = 100;
		System.out.println("the int value after removing 5 is: "+reduce5(num1));

//	Explicit value deduction 
		int pInt1 = wInt.intValue();
		System.out.println(pInt1);

	}
}
