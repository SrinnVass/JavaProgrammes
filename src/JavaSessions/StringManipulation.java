package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String s = "The rain have started here";
		
		System.out.println(s.length()); // will print the length of the string
		
		System.out.println(s.charAt(10)); // will print the char at the index 10
		
		System.out.println(s.indexOf('e')); // will print the index at the char e i.e 1st occurence
		
		System.out.println(s.indexOf('e',3)); // 2nd occurance of e
		
		System.out.println(s.indexOf('e',13)); // 3rd occurance of e
		
		System.out.println(s.indexOf("have")); // will print the index of hello i.e h index is 9
		
		System.out.println(s.indexOf("hello")); // will print -1 because that particular string is not present
		
		String s1 = "selenium";
		
		String s2 = "Selenium";
		
		System.out.println(s1.contentEquals(s2));
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3 = "The rain have started here";
		
		System.out.println(s3.substring(0, 13)); // will print the sub string The rain have
		
		String s4 = " Hello  world ";
		
		System.out.println(s4.trim()); // will remove the blank spaces present in first and last but not center
		
		System.out.println(s4.replace(" ", "")); // will remove the blank space in between hello and world
		
		String date  = "01-01-2018";
		
		System.out.println(date.replace("-","/")); // will repace the date with / symbol
		
		String text = "hello/world/selenium/corejava";
		
		String textval[]= text.split("/");
		
		for (int i=0; i<textval.length;i++) {
			
			System.out.println(textval[i]);
			
		}
		
		String s5 = "Hello";
		
		String s6 = "world";
		
		int a = 100;
		
		int b = 200;
		
		System.out.println(s5+s6);
		
		System.out.println(a+b);
		
		System.out.println(s5+s6+a+b);
		
		System.out.println(a+b+s5+s6);
		
		System.out.println(s5+s6+(a+b));
		
		
		
		
		
		
		
		
	}

}
