class MyException extends Throwable{
	public MyException(String e){
		System.out.println(e);
	}
}

public class Test {	
	public static void main(String... args) {
		try {
			throw new MyException("This is custom made Exception");
		} catch(MyException e){
			System.out.println(e);
		} finally {
			System.out.println("This is finally block");
		}
	}
}
