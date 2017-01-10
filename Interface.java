package practice1;
/*
interface MyInteface {
	default void get(){
		System.out.println("Default method 1");
	}
}

public class Interface implements MyInteface {
	public void get(){
		System.out.println("Default method 2");
	}
	
	public static void main(String...strings){
		Interface obj = new Interface();
		obj.get();
	}
}
*/

//Nested interface

interface I1{
	public void get();
	
	interface I2{
		public void show();
	}
}

public class Interface implements I1.I2{
	
	public void show(){
		System.out.println("Hello");
	}
	public static void main(String...strings){
		Interface obj = new Interface();
		obj.show();
	}
}