abstract class A {
	public abstract void show();
}

public class Test extends A {

	public void show(){
		System.out.println("Abstract method of abstract class overrided");
	}
	
	public static void main(String... args) {
		Test obj = new Test();
		obj.show();
	}
}
