public class Test {
	
	public void show(int a){
		System.out.println(a);
	}
	
	public void show(float a){
		System.out.println(a);
	}
	
	public void show(String a){
		System.out.println(a);
	}
	
	public static void main(String... args) {
		Test obj = new Test();
		obj.show(10);
		obj.show(10f);
		obj.show("Hello Java");
	}
}
