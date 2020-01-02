package com.deloitte.Library.model;

public class Library {
	private  static int Book_Id;
	private String name;
	private int price;
	private String Author;
	private static int counter;
	
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Library.counter = counter;
	}

	static {
		counter=1001;
	}
	
	
	public static int getBook_Id() {
		return Book_Id;
	}
	public static void setBook_Id(int book_Id) {
		Library.Book_Id = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "Library [ Book_Id="+ Book_Id +", name=" + name + ", price=" + price + ", Author=" + Author +  "]";
	}
}
