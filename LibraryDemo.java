package com.deloitte.Library.main;
import java.util.Scanner;

import com.deloitte.Library.model.Library;
import com.deloitte.Library.service.BookImpl;

import java.util.ArrayList;

public class LibraryDemo {
	public static void main(String args[]) {
		
		Scanner s =new Scanner(System.in);
		ArrayList<Library> list=new ArrayList<Library>();
		while(true) {
		System.out.println("please enter option 1 to add new book"+ "option 2 to display "+
				"option 4 to exit");

		BookImpl mainClassBookObj=new BookImpl();
		String option=s.next();
		switch (option) {
		
		case "1":
			
		System.out.println("enter book name");	
	    String  name=s.next();	
		
		System.out.println("ENTER Author");
		String author=s.next();
		System.out.println(" enter price");
		String price=s.next();
        mainClassBookObj.addBook(name, author, price);
        break;
		
        
		case"2":
			for(Library b:list) {
				System.out.println(b);
				
			}
			break;
		case"4":
			System.exit(0);
			break;
		}
		
	
}}
}