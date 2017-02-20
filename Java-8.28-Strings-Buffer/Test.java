public class Test {	
	public static void main(String... args) {
		StringBuffer s = new StringBuffer();
		System.out.println("Initial capacity of String Buffer is - "+s.capacity());
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println("Initial capacity of String Buffer + length of the given string is - "+s1.capacity());
		s1.append(" Java");
		System.out.println(s1);
	}
}
