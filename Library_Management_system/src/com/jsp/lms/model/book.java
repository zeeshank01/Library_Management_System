package com.jsp .lms.model;
//1
public class book {
	// entities
	private String bookName; // encapsulation
	private String bookAuthor;
	private double bookPrice;
	//getter setter we have do after put entities
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//for fetch 
	@Override
	public String toString() {
		return " bookName=" + bookName + ", \nbookAuthor=" + bookAuthor + ", \nbookPrice=" + bookPrice + "";
	}
	
}
