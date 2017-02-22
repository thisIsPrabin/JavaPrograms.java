package practices;

import java.io.*;
import java.util.zip.*;

public class TestInflat {

	public static void main(String[] args) {
		try {
			InflaterInputStream ifal = new InflaterInputStream(
					new FileInputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\zip.txt"));
			
			FileOutputStream fout = new FileOutputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt");
			
			int data;
			
			while((data=ifal.read())!= -1){
				fout.write(data);
			}
			
			fout.flush();
			fout.close();
			ifal.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
