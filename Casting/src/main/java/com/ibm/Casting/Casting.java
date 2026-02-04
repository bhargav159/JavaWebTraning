package com.ibm.Casting;

class Animal {
	public void Eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("dog is barking");
	}

	public void Eat() {
		System.out.println("Dog is eating");
	}
}

public class Casting {

	public static void main(String[] args) {

//		upcasting (child object -> parent reference)
		Animal animal = new Dog();

		animal.Eat();
//		animal.bark(); 
//		error because Parent reference cant access subclass method 
//		to access the subclass methods we downcast them 
//		downcasting parent to subclass to access subclass methods or feilds 
//		it may cause errors 
		Dog dog = (Dog) animal;
		dog.bark();
		dog.Eat();

//		safe downcasting to avoid runtime error of classCastException 
		if (animal instanceof Dog) {
			Dog dog1 = (Dog) animal;
			dog1.bark();

		}

	}
}
