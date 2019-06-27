package JavaSessions;

public class StringConcepts {

	public static void main(String[] args) {
		
		
		// Concat method applies only for Strings
		
		String s = new String("Durga");
		
		s.concat("Software");
		
		System.out.println(s);
		
		// Append method applies only for StringBuffer
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.append("Software");
		
		System.out.println(sb);
		
		
		System.out.println("******************");
		
		
		String s1 = new String("Durga");
		
		String s2 = new String("Durga");
		
		//String class Double equal operator always meant for reference comparison, s1 and s2 are not pointing out to the same object. so it will return false
		
		System.out.println(s1==s2);
		
		System.out.println("******************");
		
		//String class Equal method always meant for content comparison. here s1 and s2 having same content Durga so it will print true.
		
		System.out.println(s1.equals(s2));
		
		System.out.println("******************");
		
		
		StringBuffer sb1 = new StringBuffer("Durga");
		
		StringBuffer sb2 = new StringBuffer("Durga");
		
		//String Buffer class Double equal operator always meant for reference comparison. Here s1 and s2 are not pointing out to the same object.it will return false
		
		System.out.println(sb1==sb2);
		
		System.out.println("******************");
		
		//String Buffer class Equal operator always meant for reference comparison
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println("******************");
		
		
		
		
		
		
		
	}

}
