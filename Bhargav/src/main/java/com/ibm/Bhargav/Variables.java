package com.ibm.Bhargav;

public class Variables {
	
	/*1 Local variables/Method variables
	 */
	 public void getAge() {
		 int age = 22;
		 System.out.println("Age is:"+age);
	 }
	 
//	 instance variables
	 public String name;
	 public double salary = 1000.00;
	 
	 //constructor 
	 public Variables(String UserName) {
		 name = UserName;
	}
	 public void getDetails() {
		System.out.println("Name is:"+name);
		System.out.println("Salary is:"+salary);
	}
//	static variables/ class variables 
	public static char Gender ;
	public static final String DEPARTEMENT = "Java";  // constant value 
	
	public static void main(String[] args) {

		 Variables variables = new Variables("Bhargav");
		 
		 // variables.age = 10; error because age cannot be accessed without method
		 // System.out.println(variables.age); 
		 // System.out.println(age);  
		 
		 variables.getAge();  // accessing the local variables only using method 
		 
		 variables.name = "Bhargav Krishna";  // accessing the instance variable and changing value  
		 variables.salary = 2000;
		 variables.getDetails();  //accessing the instance variables
		 
		 System.out.println("Departement is:"+DEPARTEMENT);  // accessing the constant value
		 Gender = 'M';  // static can be used without object name 
		 System.out.println("Gender is:"+Gender);
	}
}
/*
 * Local variables : we can only access the method variable using object 
 * and they are destroyed when the method is exited.
 * Instance variables: are created outside method or constructor 
 * And they are initialized when object is created with "new" and destroyed when object is destroyed.
 * Static variables: can be accessed by calling with the class name ClassName.VariableName. or even direct Name 
 * they are created when the program starts and destroyed when the program stops.
 * */