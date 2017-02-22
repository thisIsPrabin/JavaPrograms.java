import java.io.*;
import java.util.Scanner;

public class TestByteArrayOutputStream {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			FileOutputStream fout = new FileOutputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt");
			ByteArrayOutputStream bas = new ByteArrayOutputStream();
			
			int data = 65;
			bas.write(data);
			bas.writeTo(fout);
			bas.close();
			in.close();
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
