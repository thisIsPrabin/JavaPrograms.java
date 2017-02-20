public class Test {

	public static void main(String... args) {
		Test obj = new Test();
		if(obj instanceof Test){
			System.out.println("Obj is Test class object");
		} else {
			System.out.println("Obj is not Test class object");
		}
	}
}