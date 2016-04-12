package Networing;

import java.net.*;
import java.io.*;

public class Client {
	
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("localhost",888);
		DataOutputStream data = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		String str1, str2;
		while(!(str2 = kb.readLine()).equals("exit")){
			data.writeBytes(str2+"\n");
			str1 = br.readLine();
			System.out.println(str1);
		}
		
		data.close();
		br.close();
		kb.close();
	}
}
