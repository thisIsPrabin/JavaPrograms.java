package practices;

public class ThreadInfo extends Thread {
	
	public void run(){
		
		try {
			
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getState());
				System.out.println(Thread.currentThread().getPriority());
				System.out.println(Thread.currentThread().isAlive());
				Thread.currentThread().setName("Prabin");
				System.out.println(Thread.currentThread().getName());
				Thread.currentThread().setPriority(5);
				System.out.println(Thread.currentThread().getPriority());
				Thread.sleep(600);
			
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ThreadInfo obj = new ThreadInfo();
		Thread th = new Thread(obj);
		th.start();
	}

}
