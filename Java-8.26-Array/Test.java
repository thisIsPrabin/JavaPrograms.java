import java.util.Scanner;

public class Test {	
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.print("Enter five numbers - ");
		for(int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		input.close();
	}
}
