package com.deloitte.Library.Dao;

import java.sql.*;

import com.deloitte.Library.model.Library;

public class BooksDAO {
	public static Connection connectToDB() {
		//Register the driver
		Connection connection=null;
	  try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	   connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			return connection;	
	  } catch (ClassNotFoundException |SQLException e ) {
	
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
	}
	public static  void addBook(Library b) {
	
		try {
			Connection con=connectToDB();
	    //step  create the statement
	PreparedStatement stmt=connectToDB().prepareStatement("insert into book values(?,?,?,?)");
		stmt.setInt(1,b.getBook_Id());
		stmt.setString(2,b.getName());
		stmt.setString(3,b.getAuthor());
		stmt.setDouble(4,b.getPrice());
		
		
		
		//step 4 execute sql query
		
		int affectedRows=stmt.executeUpdate();
		System.out.println("affectedRows="+affectedRows);
		ResultSet rs=stmt.executeQuery("select * from book");
		while(rs.next()) {
		
		System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getDouble(4));
		
		//step 5 close connection
		con.close();
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	}
}
