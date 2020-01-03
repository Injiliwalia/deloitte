package com.deloitte.designation.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.deloitte.designation.model.PersonalDetails;

public class PersonalDAO {
	
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
	public static void adduser(PersonalDetails p) {
	
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
	
	public static ArrayList<PersonalDetails> displayAllUsers() {
		Connection connection= connectToDB();
		ArrayList<PersonalDetails> list = new ArrayList<PersonalDetails>();
		try {
			PreparedStatement stmt=connectToDB().prepareStatement("select * from  PersonalDetails");
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				 PersonalDetails p=new  PersonalDetails();
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
			
			

	public static void LogIn(String userId, String pass) {
		// TODO Auto-generated method stub
		Connection connection= connectToDB();
		
		try {
	
			PreparedStatement stmt=connectToDB().prepareStatement("select * from  PersonalDetails where userid=? and password=?");
			stmt.setString(1,userId);
			stmt.setString(2,pass);
			ResultSet rs=stmt.executeQuery();
			int count=0;
			while(rs.next()) {
				count++;
			}
			if(count!=0)
				System.out.println("valid user");
			else {
				System.out.println("invalid user");
			}
		
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}
	}