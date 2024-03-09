                                     Welcome to the documentation for the Library Management System (LMS). 

<h3>INTRODUCTION</h3>


A Library Management System, dedicated to maintaining library records, significantly enhances efficiency by minimizing the time spent on administrative tasks. 


1)Adding new books to the library collection.

2)Conducting quick and effective searches for books.

3)Removing books from the library inventory as needed.

4)Updating book prices to reflect changes accurately.

5)Viewing a comprehensive list of all available books.

<h3>FEATURE OF LIBRARY MANAGEMENT SYSTEM</h3>

i)Design a Library Management System featuring capabilities to Add, Remove, and View the Status of Books, ensuring user-friendliness for efficient handling by librarians.
ii)Enable librarians to effortlessly perform tasks such as adding new books, removing issued books, and displaying detailed book information through the implementation of distinct classes.

<h3>WHY WE ARE CREATING THE LIBRARY MANAGEMENT SYSTEM PROJECR
USING JAVA?</h3>

Java, as an object-oriented language, encompasses several features, including free access and platform independence, making it a versatile choice for software development.
Notable characteristics, such as simplicity, security, and an object-oriented paradigm, contribute to Java's status as a preferred language for software development.

<h3>MVC ARCHITECTURE FOR LIBRARY MANAGEMENT SYSTEM</h3>

The Model-View-Controller (MVC) architecture is a software architecture that
separates an application into three main components: Model, View, and
Controller. The workflow of MVC is as follows:

Model: Represents the application's data and business logic. It is responsible for
data manipulation and storage.

View: Represents the user interface. It displays the data to the user and sends
user input to the controller.

Controller: Acts as an intermediary between the Model and the View. It receives
user input from the View, processes it, interacts with the Model to update data,
and then updates the View.

For our project, By using the concept of MVC architecture, we have Created 3
Different packages named as:

a) com.jsp.lms.model

b) com.jsp.lms.view

c) com.jsp.lms.controller

<h2>Source Code:</h2>

a)com.jsp.lms.model

>In the edu.qsp.lms.model package, two distinct classes, namely Book and Library, have been developed.

>The Book class incorporates class data members like bookname, AuthorName, price, and publication.

>The Library class includes class data members such as libraryName, libraryAddress, pinCode, and a list of books.

<h3>Book.java</h3>

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


