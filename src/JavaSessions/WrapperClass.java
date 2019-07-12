package JavaSessions;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		
		System.out.println(x+20); // String Concatenation
		
		// data conversion from string to integer
		
		int i = Integer.parseInt(x);
		
		System.out.println(i+20);
		
		System.out.println("########");
		
		String y = "true";
		
		System.out.println(y+100); // String concatenation
		
		// data conversion from string to boolean
		
        Boolean b = Boolean.parseBoolean(y);
        
        System.out.println(b);
        
        System.out.println("*******");
        
        String d = "12.25";
        
        System.out.println(d+10);  // String concatenation
        
        // data coversion from string to double
        
        Double d1 = Double.parseDouble(d);
        
        System.out.println(d1+10);
        
        // integer to string conversion
        
        int j = 10;
        
        System.out.println(j+20);
        
        String s = String.valueOf(j);
        
        System.out.println(s+20);
        
        String u = "100a";
        
        Integer.parseInt(u); // will get number format exception
        
       
       
		
		
		
		
		
	}

}
