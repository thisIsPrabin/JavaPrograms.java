import java.io.*;

public class TestSequenceInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt");
			FileInputStream fin2 = new FileInputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\2.txt");
			FileOutputStream fout = new FileOutputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\3.txt");
			
			SequenceInputStream sin = new SequenceInputStream(fin, fin2);
			
			int data;
			
			while((data = sin.read())!=-1){
				fout.write(data);
			}
			
			sin.close();
			fin.close();
			fin2.close();
			fout.flush();
			fout.close();
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
