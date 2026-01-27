//package com.ibm.exceptions;
//
//public class Application
//{
//	public static void main( String[] args )
//	{
//		System.out.println(args[0] +" "+args[1]); //if we run we get error of indexoutofbounds c
//		// we need to use "PS C:\Bhargav\eclipse-workspace\exceptions>
//		// java -cp target\classes com.ibm.exceptions.Application "IBM Technoogies" Banglore" 
//		// to get output IBM Technologies Banglore 
//		
//	}
//}

package com.ibm.exceptions;

public class Application {
	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException exception ) {
			System.out.println("You need to provide 2 valid numbers");
		} catch (ArithmeticException exception) {
			System.out.println("You can't divide with zero");
		} 
//		catch (NumberFormatException exception) {
//			System.out.println("You need to provide 2 valid numbers");
//		}
		// only use base exception when we don't know what type of exception occurred 
		catch(Exception exception) {
			System.out.println("Unknown error");
		}
		System.out.println("The End");
	}
}