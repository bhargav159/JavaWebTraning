package com.ibm.Bhargav;

class Test{
	private int age;
	private String name;
	
	Test(int a, String n){
		this.age = a;
		this.name = n;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

public class Sample {
	public static void main(String[] args) {
		
		Test test1 = new Test(20,"Bhargav");
		
//		test1.setAge(10);
		System.out.println(test1.getAge());
		
	}
}
