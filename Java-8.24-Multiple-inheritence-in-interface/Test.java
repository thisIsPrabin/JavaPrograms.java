interface Interface{
	public void show();
}

interface Interface2{
	public void show();
}

public class Test implements Interface, Interface2 {
	
	public void show() {
		System.out.println("Muliple inheritence in Interface");
	}
	public static void main(String... args) {
		Test obj = new Test();
		obj.show();
	}
}
