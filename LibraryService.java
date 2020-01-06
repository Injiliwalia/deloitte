package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.LibraryDAO;
import com.example.demo.model.User;
@Service
public class LibraryService {
	
	
	
	
	@Autowired
	LibraryDAO dao;
	
	
	public ArrayList<User> getMessage() {
		return dao.displayAllUsers();
	}
	
	public ArrayList<User> getUser(int Userid) {
		return dao.displayUsers(Userid);
		
	}
	public ArrayList<User> display(int Userid) {
			return dao.displayAllUsers();
}
	public void adduser(User p){
	 dao.adduser(p);
	}
	
}