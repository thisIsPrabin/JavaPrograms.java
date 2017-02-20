
import java.io.*;

public class Test {	
	public static void main(String... args) {
		try {
			int data;
			FileInputStream in = new FileInputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt");
			FileOutputStream out = new FileOutputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\2.txt");
			
			while((data = in.read())!= -1){
				out.write(data);
			}
			in.close();
			out.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
