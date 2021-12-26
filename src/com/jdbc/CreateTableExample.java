package com.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {
	public static void main(String[] args) throws SQLException,
    ClassNotFoundException{
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","rootpass");
			
			Statement stmt = con.createStatement();
			String query = "create table customers_1( ID number(2) not null, NAME varchar2(20) not null, AGE number(2) not null, SALARY number(10), ADDRESS char(25), primary key(ID))";
			stmt.execute(query);
			con.close();	
			System.out.println(" Table created successfully......");
			
		}catch(Exception e){
			System.out.println(e);
		} 
		
	}
}
