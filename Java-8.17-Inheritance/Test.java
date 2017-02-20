class A{
	public void show(){
		System.out.println("A class method");
	}
}

public class Test extends A {
	public static void main(String... args) {
		Test obj = new Test();
		obj.show();
	}
}
