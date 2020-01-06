package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private int boookId;
	private String bookNmae;
	private double price;
	
	
	
	
	
	
	
	
	
	
	public int getBoookId() {
		return boookId;
	}
	public void setBoookId(int boookId) {
		this.boookId = boookId;
	}
	public String getBookNmae() {
		return bookNmae;
	}
	public void setBookNmae(String bookNmae) {
		this.bookNmae = bookNmae;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
