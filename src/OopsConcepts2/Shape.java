package OopsConcepts2;

public abstract class Shape {
	
	// cannot create object of an abstract class
	
	// can create constructors in abstract class
	
	// partial abstraction is possible in abstraction .. 100% abstraction is possible only in interface
	
	// in interface no method body only method declaration .. actual business logic will be implemented inside the child class
	
	
	
	String colour;
	
	abstract void drawing(); // abstract method
	
	public void fill() {    // non abstract method i.e having method body 
		
		System.out.println("fill method");  // in abstract class we can have abstract methods as well as non abstract methods 
		
	}
	

}
