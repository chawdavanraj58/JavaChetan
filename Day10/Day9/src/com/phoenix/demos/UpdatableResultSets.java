package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatableResultSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select * from emp");
			
			//Inserting a row
			rs.moveToInsertRow();
			rs.updateInt(1, 5006);
			rs.updateString(2, "Through the updatable");
			rs.updateInt(3, 1000);
			rs.updateInt(4, 1000);
			rs.updateString(5, "Alias");
			rs.updateInt(6, 1000);
			rs.insertRow();
			
			//Updating a row
			rs.absolute(4);
			rs.updateString(2, "Changed Valued");
			rs.updateRow();
			
			//Deleting a row
			rs.absolute(2);
			rs.deleteRow();
			
			rs.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
