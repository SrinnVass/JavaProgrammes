package JavaSessions;

public class StaticVsNonStatic {
	
	static int age = 25; // static global variable
	
	String name = "Lucky"; // non static global variable
	

	public static void main(String[] args) {
		
		// how to call static methods
		
		// 1) Direct calling
		
		  add();
		
		// 2) calling by class name
		  
		  StaticVsNonStatic.add();
		  
		// how to call  static variables
		  
		// 1) Direct calling
		  
		  System.out.println(age);
		  
		// 2) calling by class name
		  
		  System.out.println(StaticVsNonStatic.age);
		  
		// how to call non static methods
		  
		// we have to create an object in order to call non static methods or variables
		  
		  StaticVsNonStatic obj = new StaticVsNonStatic();
		  
		  obj.sum();
		  
		  System.out.println(obj.name);
		 	
	}
	
	
	public void sum() { // non static method
		
		System.out.println("sum method");
		
	}
	
	
	public static void add() { // static method
		
		System.out.println("add method");
		
	}
	

}
