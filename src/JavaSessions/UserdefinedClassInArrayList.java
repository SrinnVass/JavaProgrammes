package JavaSessions;

import java.util.ArrayList;
import java.util.Iterator;


public class UserdefinedClassInArrayList {

	public static void main(String[] args) {
		
		// create an EmployeeClass objects
		
		
		EmployeeClass e1 = new EmployeeClass("sri",26,"qa");
		
		EmployeeClass e2 = new EmployeeClass("pardhu", 28, "admin");
		
		EmployeeClass e3 = new EmployeeClass("lucky", 24, "dev");
		
		
		// create an ArrayList
		
		ArrayList<EmployeeClass> ar = new ArrayList<EmployeeClass>();
		
		ar.add(e1);
		
		ar.add(e2);
		
		ar.add(e3);
		
		// will use iterator for traverse the objects
		
		Iterator<EmployeeClass> it = ar.iterator();
		
		while(it.hasNext()) {
			
		EmployeeClass Emp = it.next();
		
		System.out.println(Emp.name);
		
		System.out.println(Emp.age);
		
		System.out.println(Emp.dept);
		
			
			
		}
				
		
		
		

	}

}
