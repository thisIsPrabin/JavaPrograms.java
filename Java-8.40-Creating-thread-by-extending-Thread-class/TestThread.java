package practices;

public class TestThread extends Thread {

	String str = "It is running";
	
	public void run(){
		try {
			for(int i=0; i<str.length(); i++){
				System.out.print(str.charAt(i));
				Thread.sleep(600);
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		TestThread th = new TestThread();
		th.start();
	}

}
