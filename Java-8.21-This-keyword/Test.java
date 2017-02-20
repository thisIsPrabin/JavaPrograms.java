public class Test {

	int a;
	public Test(){
		this(10);
		System.out.println("This keyword example 2");
	}
	
	public Test(int a){
		this.a = a;
		System.out.println("This keyword example 1 and value of a is "+a);
	}
	
	public static void main(String... args) {
		Test obj = new Test();
	}
}
