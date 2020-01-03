package com.deloitte.designation.services;

import java.util.ArrayList;

import com.deloitte.designation.model.PersonalDetails;

public interface PersonalInterface {
  
	
	public void adduser(String userid,String emailid, String name,String fathername,String mothername,String address,String contactno,String gender,String password);
   public ArrayList<PersonalDetails> displayAllUsers();
   public  void LogIn(String userId,String pass);

}



