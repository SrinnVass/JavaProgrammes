package JavaSessions;

import java.util.Scanner;

public class FibinocciSeries {

	public static void main(String[] args) {
		
		int n; int a=0; int b=0; int c=1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the value of n:");
		
		n = s.nextInt();
		
		s.close();
		
		System.out.print("fibonocci series:");
		
		for(int i=1; i<=n; i++) {
			
			a=b;
			
			b=c;
			
			c=a+b;
			
			System.out.println(a+"");
			
			
		}
			
		
	    	  
		
	}

}
