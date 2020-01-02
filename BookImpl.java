package com.deloitte.Library.service;

import java.util.*;

import com.deloitte.Library.Dao.BooksDAO;
import com.deloitte.Library.model.Library;

public class BookImpl implements BookInterface {

	@Override
	public void addBook( String name, String author, String price) {
		// TODO Auto-generated method stub
		Library b=new Library();
		b.setBook_Id(b.getCounter());
		b.setName(name);
		b.setPrice(Integer.parseInt(price));
		b.setAuthor(author);
		BooksDAO.addBook(b);
	}

	@Override
	public Library[] displayAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
