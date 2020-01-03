package com.deloitte.designation.main;
import java.util.ArrayList;
import java.util.Scanner;


import com.deloitte.designation.model.PersonalDetails;
import com.deloitte.designation.services.PersonalImpl;

 public class PersonalDemo {
    public static void main(String args[]) {
	
    	
		Scanner s =new Scanner(System.in);
		ArrayList<PersonalDetails> list=new ArrayList<PersonalDetails>();
		while(true) {
			System.out.println("please enter option 1 to add new user"+ "option 2 to display all user "+
					"option 3 to login  "+"option 4 to exit");
			
			 PersonalImpl mainClassBookObj=new  PersonalImpl();
			String option=s.next();
			switch (option) {
		
		
			case"1":
		
		
		    System.out.println("enter userid");	
			String  userid=s.next();
				
			System.out.println("enter emailid");	
		    String emailid=s.next();	
			
			System.out.println("ENTER name");
			String name=s.next();
			 
		    System.out.println(" enter fathername");
			String fathername=s.next();
			
			System.out.println("enter mothername");	
		    String mothername=s.next();
					
		    System.out.println("enter address");	
			String address=s.next();	
				
			System.out.println("ENTER contactno");
			String contactno=s.next();
				 
		    System.out.println(" enter gender");	
		    String gender=s.next();
				   
			System.out.println("enter password");	
			String password=s.next();
						
			 mainClassBookObj.adduser(userid,emailid,name,fathername,mothername,address,contactno,gender,password);
		        break;
				
			
			case"2":
				list=mainClassBookObj.displayAllUsers();
				for( PersonalDetails p:list) {
					System.out.println(p);
				
				}
			case"3":
				
			    System.out.println("enter userid");	
				String  userId=s.next();
				
				System.out.println("enter password");	
				String pass=s.next();
				
				 mainClassBookObj.LogIn(userId, pass);
				break;
			
			case"4":
				System.exit(0);
				break;
			
		}				
}
}
 }