public class Test {	
	public static void main(String... args) {
		String str = "Geeks for geeks";
		System.out.println("Length of the string - "+str.length());
		System.out.println("Char at 3rd position - "+str.charAt(3));
		System.out.println("Substring - "+str.substring(3));
		
		String str1 = "Geeks ";
		String str2 = "for geeks";
		
		System.out.println("Concatenation of string - ");
		System.out.println("First string - '"+str1+"' Second string - '"+str2+"'");
		System.out.println("Concatenated string "+str1.concat(str2));
		System.out.println("Index of first g - "+str.indexOf('g'));
		
		System.out.println("Equals method "+str1.equals(str2));
		System.out.println("Compare to method "+str1.compareTo(str2));
	}
}
