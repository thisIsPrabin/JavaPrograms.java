package practices;

public class TestThread3 {

	public static void main(String[] args) {
		Thread th = new Thread(){
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
		};
		th.start();
	}
}
