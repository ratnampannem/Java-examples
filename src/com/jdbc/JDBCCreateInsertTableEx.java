package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreateInsertTableEx {
	

	String db_driver = "oracle.jdbc.driver.OracleDriver";
	String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
	String db_username = "SYSTEM";
	String db_password = "rootpass";
	
	Connection con;
	Statement stmt;
	public static void main(String[] args) throws SQLException,
    ClassNotFoundException{
		
		
		JDBCCreateInsertTableEx jdbcObj = new JDBCCreateInsertTableEx();
		jdbcObj.createTable();
		jdbcObj.insertIntoTable();
		jdbcObj.showTable();
		
	}

	private void insertIntoTable() {
		try{  
			
			Class.forName(db_driver);
			  
			con=DriverManager.getConnection(db_url, db_username, db_password);  
			  
			stmt=con.createStatement();  
			  
			//String query = "insert into Student_Info values(10, 'Likith', 'EEE','HYD')";
			
			for(int i=1; i<=5; i++){
				
				String query1 = "insert into Student_Info values("   +   "i "+", 'Likith', 'EEE','HYD')";
				
				String query = "insert into Student_Info values("  + i  +", 'Likith "+ i +"', 'EEE','HYD')";
				
				int count = stmt.executeUpdate(query);
				System.out.println(" Number of rows affected by this query= " + count);
			}
			
			
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}
		  
			  
	}
		


	private void showTable() {
		try{  
			
			Class.forName(db_driver);
			  
			con=DriverManager.getConnection(db_url, db_username, db_password);  
			  
			stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from Student_Info");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}
	}

	private void createTable() {
		
		try{  
			
			Class.forName(db_driver);
			  
			con=DriverManager.getConnection(db_url, db_username, db_password);  
			  
			stmt=con.createStatement();  
			  
			String query = "create table Student_Info(ID number(2), NAME varchar2(20), BRANCH varchar2(20), ADDRESS varchar2(20))";
			
			stmt.execute(query); 
			con.close();  
			System.out.println(" Table created successfully........");
			  
			}catch(Exception e){ System.out.println(e);}
	}
}
