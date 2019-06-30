package JavaSessions;

import java.util.ArrayList;

public class AddingElementsToArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("srinn");
		ar1.add("pandu");
		ar1.add("lucky");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("lucky");
		ar2.add("pardhu");
		ar2.add("chaithra");
		
		//for adding ar1 & ar2
		
	   ar1.addAll(ar2);
	   
	   for(int i=0; i<ar1.size(); i++) {
		   
		   System.out.println(ar1.get(i));
		   
	   }
		
	   
	   //for removing ar1 from ar2
		
		ar1.removeAll(ar2);
		
		for(int k=0; k<ar1.size();k++) {
			
			System.out.println(ar1.get(k));
			
		}
		
		// for retaining common names
		
		ar1.retainAll(ar2);
		
		for(int l = 0; l<ar1.size(); l++) {
			
			System.out.println(ar1.get(l));
			
		}
		
		
		
	}

}
