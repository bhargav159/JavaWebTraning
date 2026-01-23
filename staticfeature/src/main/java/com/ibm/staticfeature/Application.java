package com.ibm.staticfeature;

class Test{
	static int value;
	Test(){
		System.out.println("Constructor called ");
	}
	
	static {
		System.out.println("Static initializer called");
	}
	
	{
		System.out.println("Inlie block called");
	}
}



public class Application
{
	public static void main( String[] args )
	{
		new Test();
		
	}
}
//
//output:
//	Static initializer called
//	Inline block called
//	Constructor called 
//because when a class is created and class memory is loaded static block first executes 
//then inline block and finally constructor is called 

// to make static code is executed when class is created and memory loaded by JVM even before object is called/created   


