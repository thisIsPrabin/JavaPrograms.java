import java.io.*;
import java.util.zip.*;

public class TestDeflat {

	public static void main(String[] args) {
		try {
			DeflaterInputStream dfat = new DeflaterInputStream( 
					new FileInputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt"));
			FileOutputStream fout = new FileOutputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\zip.txt");
			
			int data;
			
			while((data = dfat.read())!= -1){
				fout.write(data);
			}
			fout.close();
			dfat.close();
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
