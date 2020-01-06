package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;
import com.example.demo.services.LibraryService;

@Controller
@ResponseBody
public class LibraryController {
	@Autowired
	LibraryService service;
	
@RequestMapping("/User")
public ArrayList<User> getUser(@RequestParam("Userid") int Userid) {
	return service.getUser(Userid);
}

@PostMapping("/adduser")
public void adduser(@RequestBody User p) {
	System.out.println(p);
	service.adduser(p);
	
}




@RequestMapping("/anjali")
public void adduser(@RequestParam("Userid") int Userid,@RequestParam("emailid") String emailid,@RequestParam("name") String name,@RequestParam("fathername") String fathername,@RequestParam("mothername") String mothername
		,@RequestParam("address") String address,@RequestParam("contactno") Long contactno,@RequestParam("gender") String gender,@RequestParam("password") String password) {
	User p=new User();
	p.setUserid(Userid);
	p.setEmailid(emailid);
	p.setName(name);
    p.setFathername(fathername);
    p.setMothername(mothername);
	p.setAddress(address);
    p.setContactno(contactno);
    p.setGender(gender);
	p.setPassword(password);
	
	service.adduser(p);

}

}	
//@RequestMapping("/")
//	public String getUser() {
//		return "user details will be displayed once service and dao is implement";
	
	

