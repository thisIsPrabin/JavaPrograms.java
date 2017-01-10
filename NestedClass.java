package practice1;

/*
import practice1.Outer.Inner;
class Outer {

	class Inner {
		public void get(){
			System.out.println("Inner class Method");
		}
	}
	
	public void show(){
		Inner i = new Inner();
		i.get();
	}
}

public class NestedClass {
	public static void main(String...strings){
		Outer o = new Outer();
		o.show();
		
		// or
		
		Inner i = o.new Inner();
		i.get();
	}
}
*/
/*
abstract class Anonymous {
	public abstract void get();
}

public class NestedClass {
	
	public static void main(String...strings){
		Anonymous aobj = new Anonymous(){
			public void get(){
				System.out.println("Anonymous class");
			}
		};
		aobj.get();
	}
}
*/

public class NestedClass {
	
	public void innerMethod(){
		class LocalClass {
			public void get(){
				System.out.println("Local Inner class");
			}
		}
		LocalClass lc = new LocalClass();
		lc.get();
	}
	
	public static void main(String...strings){
		NestedClass nc = new NestedClass();
		nc.innerMethod();
	}
}
	