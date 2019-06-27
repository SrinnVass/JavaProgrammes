package JavaSessions;

public class StringBufferConcepts {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity()); // will print the capacity of a string buffer
		
		System.out.println("***********");
		
		StringBuffer sb1 = new StringBuffer(1000);
		
        System.out.println(sb1.capacity()); // will print the capacity of a string buffer i.e 1000
		
		System.out.println("***********");
		
		StringBuffer sb3 = new StringBuffer("Durga");
		
		System.out.println(sb3.capacity()); // will print 21 because  capacity = s.length+16 i.e length = 5+16 = 21
		
		System.out.println("***********");
		
		StringBuffer sb4 = new StringBuffer("Durga");
		
		System.out.println(sb4.charAt(2)); // will print the char present at the 2nd index i.e r 
		
		System.out.println("***********");
		
		StringBuffer sb5 = new StringBuffer("java");
		
		sb5.setCharAt(0, 'l');   // will replace the 0th index with char l
		
		System.out.println(sb5); 
		
		System.out.println("************");
	
		
		StringBuffer sb6 = new StringBuffer();
		
		sb6.append(true);
		
		sb6.append('c');
		
		sb6.append(12.25);
		
		sb6.append("Srinn");
		
		System.out.println(sb6); // will append i.e combined all the values and print
		
		System.out.println("************");
		
		StringBuffer sb7 = new StringBuffer("abcdefghi");
		
		sb7.insert(4, "sri"); // will add sri in the 4th index and will print the value along with the 4th index char
		
		System.out.println(sb7); 
		
		System.out.println("************");
		
		StringBuffer sb8 = new StringBuffer("abcdefghi");
		
		sb8.delete(2, 8); // will remove  from 2nd index to (end-1) i.e 8-1 = 7th index and will print rest of the values
		
		System.out.println(sb8);
		
		System.out.println("************");
		
		StringBuffer sb9 = new StringBuffer("abcdefghi");
		
		sb9.deleteCharAt(4); // will delete the char at 4th index
		
		System.out.println(sb9);
		
		System.out.println("************");
		
		StringBuffer sb10 = new StringBuffer("durga");
		
		System.out.println(sb10.reverse()); // will print the name in the reverse order
		
		System.out.println("************");
		
		StringBuffer sb11 = new StringBuffer("durga");
		
		sb11.setLength(3); //will print only first 3 char and rest of the letters will b ignored
		
		System.out.println(sb11);
		
		System.out.println("************");
		
		StringBuffer sb12 = new StringBuffer(1000);
		
		sb12.append("abc");
		
		System.out.println(sb12.capacity()); // will print the capacity 1000
		
		sb12.trimToSize();
		
		System.out.println(sb12.capacity());
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
