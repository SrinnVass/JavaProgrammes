package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(300);
		ar.add(500);
		
		// to print the value of given array list we will use get index method
		
		System.out.println(ar.get(2));
		
		// to find out the length we will use size method
		
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add(1);
		ar.add(12.25);
		ar.add('3');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5));
		
		//to print all the values we will use for loop
		
		for(int i = 0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		// for adding only integer values we will use
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		ar1.add(100);
		ar1.add(200);
		ar1.add(1);
		
		System.out.println(ar1.size());
		
		// for loop for printing all the values
		
		for(int j = 0 ; j < ar1.size(); j++) {
			
			System.out.println(ar1.get(j));
			
		}
		
		// for adding only String values
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Ram");
		ar2.add("Srinn");
		ar2.add("lucky");
		
		System.out.println(ar2.size());
		
		//for loop for printing all the values
		
		for(int  k = 0; k <ar2.size(); k++) {
			
			System.out.println(ar2.get(k));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
