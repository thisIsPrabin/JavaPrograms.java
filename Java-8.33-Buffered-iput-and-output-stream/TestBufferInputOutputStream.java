import java.io.*;

public class TestBufferInputOutputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\2.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			FileOutputStream fout = new FileOutputStream("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			int data;
			
			while((data = bin.read())!= -1){
				bout.write(data);
			}
			
			bin.close();
			fin.close();
			bout.flush();
			bout.close();
			fout.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
