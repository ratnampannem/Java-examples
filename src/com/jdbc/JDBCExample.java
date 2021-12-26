package com.jdbc;

import java.sql.*;


public class JDBCExample {
	public static void main(String[] args) throws SQLException,
    ClassNotFoundException{
		
		String driverClassName
        = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "SYSTEM";
		String password = "rootpass";
		String query
        	= "insert into departments values(10, 'abs 1', 'mno')";

		// Load driver class
			Class.forName(driverClassName);
		
		// Obtain a connection
			Connection con = DriverManager.getConnection(url, username, password);

		// Obtain a statement
			Statement st = con.createStatement();

		// Execute the query
			int count = st.executeUpdate(query);
			System.out.println(
					"number of rows affected by this query= " + count);

			// Closing the connection as per the
			// requirement with connection is completed
			con.close();
			
	}
		
}
