package database;

import java.sql.*;

public class ConnectionProviderMysql {
	
	static Connection connection;
	
	static {
		if(connection == null){
			
			try {
				
				String className = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/test", userName = "root", pass = "";
				
				Class.forName(className);
				connection = DriverManager.getConnection(url, userName, pass);
				
				
			}catch(Exception e){
				System.out.println("ERROR: Establishing the connection");
			}
		}
	}
	
	
	public static Connection getConnection(){
		return connection;
	}

}
