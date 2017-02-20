public class Test {
	
	public Test(){
		System.out.println("Default Constructor");
	}
	
	public Test(String args){
		System.out.println(args);
	}

	public static void main(String... args) {
		Test obj = new Test();
		Test obj1 = new Test("Parameter Constructor");
	}
}
