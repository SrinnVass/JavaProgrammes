package JavaSessions;

public class FactorialOfaNumbers {

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		
		System.out.println(factorial(6));
		
		System.out.println(fact(3));
		
		System.out.println(fact(5));
		
		
	}
	
	
	// without using recursive procedure
	
	public static int factorial(int num) {
		
		int fact = 1;
		
		if(num==0)
			
	    return 1;
		
		for(int i=1; i<=num; i++) {
			
			fact = fact * i;
			
		}
		
		return fact;
		
	}
	
	
	// using recursive procedure
	
	public static int fact(int num) {
		
		if(num == 0)
			
		return 1;
		
		else
			
		return (num *(fact(num-1)));	
			
	}

}
