package database;

import java.sql.*;

public class MysqlConnect {
	
	Connection con;
	
	public MysqlConnect(){
		
		try {
			
			String className = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test", userName = "root", pass = "";
			
			Class.forName(className);
			con = DriverManager.getConnection(url,userName,pass);
		
		}catch(Exception e){
			
			System.out.println("ERROR: Problem establishing database connection");
		}	
	}
	
	
	public void showData(){
		
		try {
		
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from emp");
			
			System.out.print("ID \tName\n");
			System.out.print("----------------\n");
			
			while(rs.next()){
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("name")+"\n");
			}
		} catch(Exception e){
			System.out.println("ERROR: Cannot retrive the data");
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
		}catch(Exception e){
			System.out.println("ERROR: Can not close the connection");
		}
	}
	
	
	public static void main(String...strings){
		
		MysqlConnect obj = new MysqlConnect();
		obj.showData();
		obj.closeConnection();
	}
}
