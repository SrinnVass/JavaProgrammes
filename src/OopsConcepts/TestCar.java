package OopsConcepts;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();
		
		b.stop();
		
		b.automaticlock();
		
		b.theftsafety();
		
		b.refuel();
		
		
		System.out.println("*********");
		
		Car c = new Car();
		
		c.start();
		
		c.stop();
		
		c.refuel();
		
		System.out.println("**********");
		
		
		// Top casting :  Down casting is not possible, will throw an error
		
		BMW c1 = new BMW(); // Dynamic polymorphism or runtime polymorphism : child class object can be referred by parent class object reference variable
		
		c1.start();
		
		c1.stop();
		
		c1.refuel();  // only common methods (i.e methods in parent as well as in child) and parent class methods will be called by using Dynamic or Runtime polymorphism
		
		
		
	}

}
