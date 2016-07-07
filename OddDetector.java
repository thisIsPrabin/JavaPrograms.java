import java.util.Scanner;

public class OddDetector {
	static Scanner input = new Scanner(System.in);
	
	public OddDetector(){
		
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		
		if(size%2 == 0){
			System.out.println("Please enter a odd size");
		} else {
			System.out.println("Enter the elements [It can only find out only one odd number not more then one]");
			int[] array = new int[size];
			
			for(int i=0; i<array.length; i++){
				array[i] = input.nextInt();
			}
			
			int res = findOdd(array);
			System.out.println(res+" is odd in entered element");
		}
	}
	
	public int findOdd(int array[]){
		
		int odd = 0;
		for(int i=0; i<array.length; i++){
			odd ^= array[i];
		}
		
		return odd;
	}

	public static void main(String[] args) {
		new OddDetector();
	}
}
