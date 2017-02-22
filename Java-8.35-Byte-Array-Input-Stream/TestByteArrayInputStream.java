import java.io.*; 

public class TestByteArrayInputStream {
	public static void main(String[] args) {
		try {
			String str = "Hello Java";
			byte arr[] = str.getBytes();
			
			ByteArrayInputStream ais = new ByteArrayInputStream(arr);
			
			int data;
			
			while((data = ais.read())!= -1){
				System.out.print((char) data);
			}
			ais.close();
			
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
