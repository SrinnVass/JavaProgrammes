package JavaSessions;

public class LocalVsGlobalVariables {
	
	// Global variables or class variables
	
	String name = "tom";
	
	int age = 25;                 
	

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		
		System.out.println(obj.name);
		
		System.out.println(obj.age);
		
		obj.sum();
		
		
	}
	
	
	public  void sum() {
		
		int i = 30;
		
		int j = 40;
		
		System.out.println(i+j);
		
		System.out.println("sum method");
		
	}

}
