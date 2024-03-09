package com.jsp.lms.model;

import java.util.List;

//(2)after model we have to create view
public class library {// encapsulation
	// entities
	private String libraryName;
	private String libraryAddress;
	private int pincode;
	//we have to create list for book and do private
	
	private List<book> books;
	//after create entities we have crate getter setter method

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public List<book> getBooks() {
		return books;
	}

	public void setBooks(List<book> books) {
		this.books = books;
	}

}
