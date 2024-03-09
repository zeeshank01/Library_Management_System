package com.jsp.lms.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.lms.model.book;
import com.jsp.lms.model.library;
import com.jsp.lms.view.view;

public class controller {
	private static library Library = view.getLibrary();

	public void addBook(book book) {
		List<book> books = Library.getBooks();
		if (books == null) {
			books = new ArrayList<>();
		}
		books.add(book);
		Library.setBooks(books);
	}

	public book getBook(String bookName) {
		List<book> books = Library.getBooks();
		if (books != null) {
			for (book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					return book;
				}
			}
		}
		return null;
	}

	public boolean removeBook(String bookName) {
		List<book> books = Library.getBooks();
		if (books != null) {
			for (book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					books.remove(book);
					return true;
				}

			}
		}
		return false;
 
	}
  public boolean update(book bookExist,book bookToUpdate) {
	  List<book> books = Library.getBooks();
	  for(book book : books) {
		  if(book.getBookName().equalsIgnoreCase(bookExist.getBookName())) {
			  books.remove(bookExist);
			  books.add(bookToUpdate);
			  Library.setBooks(books);
			  return true;
		  }
	  }
	return false;
}
//	public book updateBook(String bookName) {
//		List<book> books = Library.getBooks();
//		if (books != null) {
//			for (book book : books) {
//				if (book.getBookName().equalsIgnoreCase(bookName)) {
//				return book;
//
//				}
//			}
//		}
//		return null;
//	}
}
