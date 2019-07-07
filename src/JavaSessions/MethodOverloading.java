package JavaSessions;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
      MethodOverloading obj = new MethodOverloading(); // when the method name is same but having diff input parameters or arguments with diff data types
		
		int i = 10;
		 
		int j = 20;
		
		int k = 30;
		
		double d = 12.25;
		
		
		obj.sum();
		
		obj.sum(i);
		
		obj.sum(j, k);
		
		obj.sum(d);
		
		
	}
	
	
	public void sum() {  // 0 input parameter
		
		System.out.println("sum method --- zero input");
		
	}
	
	
	public void sum(int i) {  // 1 input parameter
		
		System.out.println("sum method ---  one input");
		
		System.out.println(i);
		
	}

	
	public void sum(int j, int k) {  // 2 input parameter
		
		System.out.println("sum method --- two input");
		
		System.out.println(j+k);
		
	}
	
	
	
	public void sum(double d) {  // 1 input parameter
		
		System.out.println("sum method --- one input");
		
		System.out.println(d);
		
	}
	

	}


