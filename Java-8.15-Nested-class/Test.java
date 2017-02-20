class Outer{
	
	class Inner{
		public void show(){
			System.out.println("Inner class method");
		}
	}
	public void show(){
		Inner inner = new Inner();
		inner.show();
	}
}

public class Test {	
	public static void main(String... args) {
		Outer obj = new Outer();
		obj.show();
	}
}
d