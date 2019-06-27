package JavaSessions;

import java.util.Arrays;

public class LargestnSmallest {

	public static void main(String[] args) {
		
		
		int numbers[] = {100,200,300,400};
		
		int Largest = numbers[0];
		
		int Smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			
			if(numbers[i]>Largest) {
				
				Largest = numbers[i];
				
			}
			
			else if(numbers[i]<Smallest) {
				
				Smallest = numbers[i];
			}
		}

		
		System.out.println("given array list is::::"+Arrays.toString(numbers));
		
		System.out.println("Highest number is::::"+Largest);
		
		System.out.println("Smallest number is::::"+Smallest);
		
		
		
		
		
		
		
		
		
		
	}

}
