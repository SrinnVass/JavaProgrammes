package JavaSessions;

public class StringMethodsAndFunctons {

	public static void main(String[] args) {
		
		String s = "Durga";
		
		System.out.println(s.charAt(3)); // will print the character at the index 3 i.e g
		
		System.out.println("****************");
		
		String s1 = "Durga";
		
		s1.concat("Software");
		
		System.out.println(s1); // we can't make any changes once if we create a string object.
		
		System.out.println("****************");
		
		String s2 = "Durga";
		
		System.out.println(s2.equals("durga")); // string class equal method always meant for content comparison. here in durga d is in small letter.so it will print false.
		
		System.out.println("****************");
		
		String s3 = "Durga";
		
		System.out.println(s3.equalsIgnoreCase("durga")); // will compare the content irrespective of upper case and lower case.content is same here. will print true. 
		
		System.out.println("**************");
		
		String s4 = "";
		
		System.out.println(s4.isEmpty()); // will check whether the string is empty or not. it will print true. since the string is empty.
		
		System.out.println("**************");
		
		String s5 = "Durga";
		
		System.out.println(s5.isEmpty()); // will check whether the string is empty or not. here the string is not empty so it will print false.
		
		System.out.println("**************");
		
		String s6 = "Durga";
		
		System.out.println(s6.length()); // will print the length of the string. it is applicable for string and array concept
		
		System.out.println("**************"); 
		
		String s7 = "Durga";
		
		System.out.println(s7.replace('g', 'a')); // will replace the old char with new char
		
		System.out.println("****************");
		
		String s8 = "abcdefghi";
		
		System.out.println(s8.substring(4)); // will print the value from 4th index to ending
		
		System.out.println("****************");
		
		String s9 = "abcdefghi";
		
		System.out.println(s9.substring(4, 8)); // will print the value from 4th index to (end-1) index i.e 4 to 7
		
		System.out.println("****************");
		
		String s10 = "Durga";
		
		System.out.println(s10.indexOf('r')); // will give the index of r
		
		System.out.println("*************");
		
		String s11 = "DurgaSoftware";
		
		System.out.println(s11.indexOf('a')); // will print the first occurrence of particular character
		
		System.out.println("************");
		
		String s12 = "bababababa";
		
		System.out.println(s12.lastIndexOf('a')); // will print the last occurrence of particular character
		
		System.out.println("************");
		
		String s13 = "DURGA";
		
		System.out.println(s13.toLowerCase()); // will convert upper case to lower case letters and will print
		
		System.out.println("**************");
		
		String s14 = "durga";
		
		System.out.println(s14.toUpperCase()); // will convert lower case to upper case letters and will print
		
		System.out.println("*************");
		
		String s15 = "Durga Software";
		
		System.out.println(s15.trim().length()); // will remove all the blank spaces present at the beginning or ending of the string but not middle
		
		System.out.println("*************");
		
		String s16 = "   Durga     ";
		
		System.out.println(s16.trim()); // will remove all the blank spaces present at beginning or ending
		
		System.out.println("*************");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
