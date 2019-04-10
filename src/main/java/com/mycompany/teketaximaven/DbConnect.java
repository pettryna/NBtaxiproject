package com.mycompany.teketaximaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DbConnect {
	 
	private static final String Username= "root";
	private static final String Password= "";
	private static final String con_String= "jdbc:mysql://localhost/teketaxi";

	public static Connection getConnection() {
		
		Connection con =null;
		DbConnect conn = new DbConnect();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(con_String,Username,Password);
			System.out.println("connected!");
			
			
		}
		catch(SQLException e){
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) throws SQLException {
		DbConnect conn = new DbConnect();
		Connection connection = conn.getConnection();
		
		Statement statement = connection.createStatement();
		statement.execute("Select * from users");
		
		ResultSet result = statement.getResultSet();
		
		while(result.next()) {
			System.out.println(result.getObject(2));
		}
	}
	
}
