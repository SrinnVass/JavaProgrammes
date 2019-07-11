package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		// integer array
		
		int i[] = new int[4];
		
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		
		System.out.println(i.length);
		
		System.out.println(i[1]);

		//if we want to print the value of i[4] it will throws array index out of bound exception
		
		//System.out.println(i[4]);
		
		//if we want to print all the values then we will use for loop here
		
		for(int j = 0; j < i.length; j++) {
			
			System.out.println(i[j]);
			
		}
		
		// char array
		
		char c[] = new char[4];
		
		c[0] = '2';
		c[1] = 'H';
		c[2] = '$';
		c[3] = '1';
		
		System.out.println(c[2]);
		
		System.out.println(c.length);
		
		//for loop for printing all the values
		
		for (int k = 0; k < c.length; k++) {
			
			System.out.println(c[k]);
			
		}
		
		
		// double array
		
		double d[] = new double[3];
		
		d[0] = 19.25;
		
		d[1] = 20.35;
		
		d[2] = 15.56;
		
		System.out.println(d[1]);
		
		System.out.println(d.length);
		
		
		//for printing all the values for loop
		
		for(int h = 0; h < d.length; h++) {
			
			System.out.println(d[h]);
				
		}
		
 		
		// boolean array
		
		boolean b[] = new boolean[2];
		
		b[0] = true;
		b[1] = false;
		
		System.out.println(b.length);
		
		System.out.println(b[1]);
		
		//for printing all the values
		
		for(int l = 0; l < b.length; l++) {
			
			System.out.println(b[l]);
				
		}
		
		// String array ... String is a class
		
		String s[] = new String[3];
		
		s[0] = "ram";
		s[1] = "tom";
		s[2] = "lucky";
		
		System.out.println(s[2]);
		
		System.out.println(s.length);
		
		//for loop for printing all the values
		
		for(int m = 0; m< s.length; m++) {
			
			System.out.println(s[m]);
			 
		}
		
		// Object array ... Object is a super class we can store different data types
		
		Object ob[] = new Object[5];
		
		ob[0] = "Tom";
		ob[1] = 1;
		ob[2] = '@';
		ob[3] = true;
		ob[4] = 12.25;
		
		System.out.println(ob[0]);
		
		System.out.println(ob.length);
		
		//for loop for printing all the values
		
		for(int n = 0; n<ob.length; n++ ) {
			
			System.out.println(ob[n]);
			
		}
		
		
	}

}
