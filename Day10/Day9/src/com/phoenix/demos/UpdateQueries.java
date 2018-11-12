package com.phoenix.demos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
			Statement stmt=con.createStatement();
			String query="insert into emp values(?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			con.setAutoCommit(false);
			
			pstmt.addBatch();
			stmt.addBatch(query);
			
			int[] updateRowCounts=stmt.executeBatch();
/*			CallableStatement cstmt=con.prepareCall("{call sp1(?,?)}");
			cstmt.execute();*/
			
			//String query="select * from emp";
			//String query="insert into emp values(5002,'Aug18',12,12,'2018',23)";
			//ResultSet rs=stmt.executeQuery(query);
			//int updateRowCount=stmt.executeUpdate(query);
			
			pstmt.setInt(1, 5003);
			pstmt.setString(2, "Name");
			pstmt.setInt(3, 12);
			pstmt.setInt(4, 1000);
			pstmt.setString(5, "JustTheName");
			pstmt.setInt(6, 1000);
			boolean queryType=pstmt.execute();
			if(queryType==true)
			{
				ResultSet rs=stmt.getResultSet();
				
			}
			else
			{
				int updateRowCount=stmt.getUpdateCount();
			}
			System.out.println(queryType);
			//con.rollback();
			con.commit();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
