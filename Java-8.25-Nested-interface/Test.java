interface Interface{
	public void show1();
	
	interface Interface2{
		public void show2();
	}
}

public class Test implements Interface, Interface.Interface2 {
	
	public void show1() {
		System.out.println("Interface method");
	}
	
	public void show2() {
		System.out.println("Sub Interface method");
	}
	
	public static void main(String... args) {
		Interface i1 = new Test();
		i1.show1();
		
		Interface.Interface2 i2 = new Test();
		i2.show2();
	}
}