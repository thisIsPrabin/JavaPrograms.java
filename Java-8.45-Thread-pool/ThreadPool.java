package practices;

import java.util.concurrent.*;

public class ThreadPool extends Thread {

	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws Exception {
		ThreadPool tp = new ThreadPool();
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<5; i++){
			ex.execute(tp);
			Thread.sleep(1000);
		}
		ex.shutdown();
	}
}
