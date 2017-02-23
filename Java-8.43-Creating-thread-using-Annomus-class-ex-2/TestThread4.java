package practices;

public class TestThread4 {

	public static void main(String[] args) {
		Runnable r = new Runnable(){
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
		Thread th = new Thread(r);
		th.start();
	}
}
