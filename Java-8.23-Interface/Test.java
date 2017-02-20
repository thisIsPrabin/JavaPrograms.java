interface Interface{
	public void show();
}
public class Test implements Interface {
	
	public void show() {
		System.out.println("Overriding Interface method");
	}
	public static void main(String... args) {
		Test obj = new Test();
		obj.show();
	}
}
