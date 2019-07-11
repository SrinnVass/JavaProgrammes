package JavaSessions;

public class Constructors {
	
	// name of the class and name of the contsructors should be same
	// there is no return type for the constructors
	
	String name;
	
	int rollno;
	
	String dept;
	
	
	Constructors(String name, int rollno, String dept) {
		
		this.name = name;
		
		this.rollno = rollno;
		
		this.dept = dept;
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		Constructors c1 = new Constructors("sri", 101, "qa");
		
		Constructors c2 = new Constructors("chaitra",102, "dev");
		
		Constructors c3 = new Constructors("laxmi", 103, "admin");
		  
		
		System.out.println(c1.name + c1.rollno +c1.dept);
		
		System.out.println(c2.name + c2.rollno + c2.dept );
		
		System.out.println(c3.name + c3.rollno + c3.dept);
		
	}

}
