package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class DataConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//for Oracle
			//Class.forName("oracle.jdbc.Driver");
			
			//for MySql
			Class.forName("com.mysql.jdbc.Driver");
			
			//generic connection URL
			// protocal:subprotocol:database specific string
			
			//for Oracle
			// url = jdbc:oracle:thin:@ip:1521:tns 
			//for MySql
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
			Statement stmt=con.createStatement();
			String query="select * from emp";
			ResultSet rs=stmt.executeQuery(query);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			//DatabaseMetaData dbmd=con.getMetaData();
			int noOfColumns=rsmd.getColumnCount();
			for(int columnCtr=1;columnCtr<noOfColumns;columnCtr++)
			{
				System.out.println(rsmd.getColumnName(columnCtr));
			}
			/*rs.previous();
			rs.first();
			rs.last();
			rs.absolute(12);
			rs.relative(-1);
			
			CachedRowSet
			JDBCRowSet
			
			rs.isBeforeFirst();
			rs.isAfterLast();*/
			//rs.close();
			while(rs.next())
			{
			
				System.out.println(rs.getString("empname"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
