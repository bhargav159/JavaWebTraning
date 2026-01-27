//package com.ibm.threads;
//
//public class Application
//{
//	public static void main( String[] args )
//	{
//		Thread mainthread = Thread.currentThread();
//		System.out.println(mainthread);
//		try {
//			mainthread.sleep(1000);
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		Thread thread1 = new Thread();
//		System.out.println("New thread");
//		System.out.println(thread1);
//		System.out.println(thread1.getState());
//		
//		thread1.start();
//		System.out.println(thread1.getState());
//		
//		try {
//			Thread.sleep(1000);
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(thread1.getState());
//		System.out.println("End");
//	}
//}

//package com.ibm.threads;
//
//class Runner implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("The current thread is "+Thread.currentThread());
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException ex) {
//			ex.printStackTrace();
//			
//		}
//	}	
//}

//public class Application
//{
//	public static void main( String[] args )
//	{
//		Thread mainthread = Thread.currentThread();
//		System.out.println(mainthread);
//		try {
//			mainthread.sleep(1000);
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		Runner runner = new Runner();
//		Thread thread1 = new Thread(runner);
//		System.out.println("New thread");
//		System.out.println(thread1);
//		System.out.println(thread1.getState());
//		
//		thread1.start();
//		System.out.println(thread1.getState());
//		
//		try {
//			Thread.sleep(1000);
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(thread1.getState());
//		System.out.println("End");
//	}
//}

//package com.ibm.threads;
//
//class Runner implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("The current thread is "+Thread.currentThread());
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException ex) {
//			ex.printStackTrace();	
//		}
//	}	
//}
//public class Application
//{
//	public static void main( String[] args )
//	{
//		
//		Runner runner = new Runner();
//		Thread producer = new Thread(runner,"producer");
//		Thread consumer = new Thread(runner,"consumer");
//		
//		
//		System.out.println(producer.getState());
//		System.out.println(consumer.getState());
//		
//		
//		producer.start();
//		consumer.start();
//		
//		try {
//			Thread.sleep(1000);
//		}catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println(producer.getState());
//		System.out.println(consumer.getState());
//		System.out.println("End");
//	}
//}

//package com.ibm.threads;
//
//class Runner implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("The current thread is "+Thread.currentThread());
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException ex) {
//			ex.printStackTrace();	
//		}
//	}	
//}
//public class Application
//{
//	public static void main( String[] args )
//	{
//		
//		Runner runner = new Runner();
//		Thread producer = new Thread(runner,"producer");
//		Thread consumer = new Thread(runner,"consumer");
//		
//		producer.start();
//		consumer.start();
//		
//		try {
//			producer.join();
//			consumer.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//		System.out.println(producer.getState());
//		System.out.println(consumer.getState());
//		System.out.println("End");
//	}
//}