package com.deloitte.designation.services;
import java.util.*;

import com.deloitte.designation.Dao.PersonalDAO;
import com.deloitte.designation.model.PersonalDetails;
public class PersonalImpl implements PersonalInterface{
   PersonalDetails p=new  PersonalDetails();
	@Override
	public void adduser(String userid, String emailid, String name, String fathername, String mothername,
			String address, String contactno, String gender, String password) {
		// TODO Auto-generated method stub
		p.setUserid(Integer.parseInt(userid));
	    p.setEmailid(emailid);
        p.setName(name);
        p.setFathername(fathername);
        p.setMothername(mothername);
	    p.setAddress(address);
	    p.setContactno(Long.parseLong(contactno));
	    p.setGender(gender);
	    p.setPassword(password);
	    PersonalDAO.adduser(p);
	
	

	
	
	
	
	
	}
	@Override
	public ArrayList<PersonalDetails> displayAllUsers() {
		// TODO Auto-generated method stub
		return PersonalDAO.displayAllUsers();
	}
	@Override
	public  void LogIn(String userId, String pass) {
		// TODO Auto-generated method stub
		 PersonalDAO.LogIn(userId,pass) ;
	}
	
	
	

}
