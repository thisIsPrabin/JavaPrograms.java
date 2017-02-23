package practices;

public class TestSynchronization {
	public static void main(String[] args) {
		Table t = new Table();
		MyThread mt = new MyThread(t);
		MyThread2 mt2 = new MyThread2(t);
		Thread th = new Thread(mt);
		Thread th2 = new Thread(mt2);
		th.start();
		th2.start();
	}
}

class MyThread extends Thread {
	Table t;
	
	public MyThread(Table t){
		this.t = t;
	}
	
	public void run(){
		try {
			t.print(5);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyThread2 extends Thread {
	Table t;
	
	public MyThread2(Table t){
		this.t = t;
	}
	
	public void run(){
		try {
			t.print(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Table {
	synchronized public void print(int n) throws Exception{
		for(int i=0; i<5; i++){
			System.out.println(n*i+" "+Thread.currentThread().getName());
			Thread.sleep(700);
		}
	}
}