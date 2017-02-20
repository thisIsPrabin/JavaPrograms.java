class SuperClass{
	public SuperClass(){
		System.out.println("Super class constructor");
	}
}

public class Test extends SuperClass {

	public Test(){
		super();
		System.out.println("Test class constructor");
	}
		
	public static void main(String... args) {
		Test obj = new Test();
	}
}
