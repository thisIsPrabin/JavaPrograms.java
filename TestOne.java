/*
 * pattern using thread
 * 
 */

public class Pattern extends Thread{
	
	public void run(){
		for(int i=0; i<=10; i++){
			for(int j=0; j<i; j++){
				System.out.printf(" %d ",j);
				try {
					this.sleep(1000);
				} catch(Exception c){
					System.out.println(c);
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String...strings){
		Pattern obj = new Pattern();
		obj.run();
	}
}
