package com.example.demo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.demo.model.User;

@Repository

public class LibraryDAO {
//	public String getMessage(){
	//	return "hello";
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
	@Autowired
	
	public ArrayList<User> displayAllUsers() {
		Connection connection= connectToDB();
		ArrayList<User> list = new ArrayList<User>();
		try {
			PreparedStatement stmt=connectToDB().prepareStatement("select * from  PersonalDetails");
		
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				User p=new User();
				p.setUserid(rs.getInt(1));
				p.setEmailid(rs.getString(2));
				p.setName(rs.getString(3));
			    p.setFathername(rs.getString(4));
			    p.setMothername(rs.getString(5));
				p.setAddress(rs.getString(6));
			    p.setContactno(rs.getLong(7));
			    p.setGender(rs.getString(8));
				p.setPassword(rs.getString(9));
			    list.add(p);
				
			}} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;	
			}	
			
	


	public ArrayList<User> displayUsers(int Userid) {
		Connection connection= connectToDB();
		ArrayList<User> list = new ArrayList<User>();
		try {
			PreparedStatement stmt=connectToDB().prepareStatement("select * from  PersonalDetails where userid=?");
			stmt.setInt(1,Userid);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				User p=new User();
				p.setUserid(rs.getInt(1));
				p.setEmailid(rs.getString(2));
				p.setName(rs.getString(3));
			    p.setFathername(rs.getString(4));
			    p.setMothername(rs.getString(5));
				p.setAddress(rs.getString(6));
			    p.setContactno(rs.getLong(7));
			    p.setGender(rs.getString(8));
				p.setPassword(rs.getString(9));
			    list.add(p);
				
			}} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;	
			}	
			
	public void adduser(User p) {
		
		try {
			Connection connection=connectToDB();
	    //step  create the statement
	PreparedStatement stmt=connectToDB().prepareStatement("insert into PersonalDetails values(?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1,p.getUserid());
		stmt.setString(2,p.getEmailid());
		stmt.setString(3,p.getName());
		stmt.setString(4,p.getFathername());
		stmt.setString(5,p.getMothername());
		stmt.setString(6,p.getAddress());
		stmt.setLong(7,p.getContactno());
		stmt.setString(8,p.getGender());
		stmt.setString(9,p.getPassword());

		
	//step 4 execute sql query	
		int affectedRows=stmt.executeUpdate();
		System.out.println("affectedRows="+affectedRows);
		
	
		
		//step 5 close connection
			connection.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

























}
	
	
	

