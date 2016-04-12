
import java.net.*;
import java.io.*;

public class Server {
	
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(888);
		Socket s = ss.accept();
		PrintStream pr = new PrintStream(s.getOutputStream());
		BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str1, str2;
			
			while((str1 = br.readLine())!= null){
				System.out.println(str1);
				str2 = kb.readLine();
				pr.println(str2);
			}
		}
	}
}
