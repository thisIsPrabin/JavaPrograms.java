abstract class Person{  
	  abstract void eat();  
}

public class Test {	
	public static void main(String... args) {
		Person p = new Person(){
			public void eat(){
				System.out.println("This is anonymous inner class");
			}
		};
		p.eat();
	}
}