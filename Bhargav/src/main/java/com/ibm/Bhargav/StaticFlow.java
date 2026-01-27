package com.ibm.Bhargav;

public class StaticFlow {
	
	static int age = 20;
	
	{
		System.out.println("Instance block is called");
	}
	
	static {
		System.out.println("Static block called ");
	}
	
	public StaticFlow() {
		System.out.println("Constructor is called ");
	}
	
	public static void main(String[] args) {
		System.out.println("main method called");
		new StaticFlow();
		
		
	}
}
/*
 * Static members are executed at class loading time before main() 
 * Execution flow for Static Members
 * Order:
 * 1. Static variables (in order of appearance)
 * 2. Static blocks (in order)
 * 3. main() method
 * 
 * Non static members are executed when object is created using "new" 
 * Execution flow for Non-Static Members
 * Order:
 * 1.Instance variables
 * 2.Instance blocks
 * 3.Constructor() 
 * 
 */
