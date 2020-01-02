package com.deloitte.Library.service;

import java.util.ArrayList;

import com.deloitte.Library.model.Library;

public interface BookInterface {
   public void addBook(String name, String author,String price);
   public Library[] displayAllBooks();
  
}
