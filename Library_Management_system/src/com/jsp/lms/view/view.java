package com.jsp.lms.view;

//3
import java.util.Scanner;

import com.jsp.lms.controller.controller;
import com.jsp.lms.model.book;
import com.jsp.lms.model.library;

public class view {
	// create a object of library
	private static library Library = new library();

	public static library getLibrary() {
		return Library;
	}

	public static void setLibrary(library library) {
		Library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static controller controller = new controller();

	static {
		System.out.println("-----Welcome to LMS-----");
		//
		System.out.print("Enter name of library :-");
		String libraryName = myInput.nextLine();
		Library.setLibraryName(libraryName);
		//
		System.out.print("Enter address of library :");
		Library.setLibraryAddress(myInput.nextLine());
		System.out.print("Enter pinCode :	");
		Library.setPincode(myInput.nextInt());
		myInput.hasNextLine();

	}

	public static void main(String[] args) {
		// for fetch
//		 System.out.println("Name :"+Library.getLibraryName());
//		 System.out.println("Add :"+Library.getLibraryAddress());
//		 System.out.println("Pincode :"+Library.getPincode());

		// book information
		do {
			System.out.println("Selet option for perform");
			System.out.println("1.Add book\n2.Remove book\n3.Update book\n4.Get book\n0.Exit");
			System.out.println("Enter digit respective to desired option");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("---- EXIT----");
				System.exit(0);
				break;
			case 1:
				// for adding we have to create object of book
				// book information will store in library list
				book book = new book();
				System.out.println("Enter book name :");
				book.setBookName(myInput.nextLine());
				System.out.println("Enter author name");
				book.setBookAuthor(myInput.nextLine());
				System.out.println("Enter price");
				book.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				controller.addBook(book);
				break;

			case 2:
				System.out.println("Enter book name you want to remove :");
				boolean removeBook = controller.removeBook(myInput.nextLine());
				if (removeBook == true) {
					System.out.println("Removed book");
				} else {
					System.out.println("Book Not removed");
				}

				break;

			case 3:
				System.out.println("Enter book name to update: ");
				book updateExist = controller.getBook(myInput.nextLine());
				if (updateExist != null) {// book exists karti hai
					com.jsp.lms.model.book bookToUpdate = updateExist;
					System.out.println("Enter bookName you want to update  :");
					System.out.println("1.Book name\n2.Author name\n3.Book Price");
					System.out.println("Enter digits respective to desired option:");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("enter book name to update");
						bookToUpdate.setBookName(myInput.nextLine());
						break;
					case 2:
						System.out.println("Enter author name to update");
						bookToUpdate.setBookAuthor(myInput.nextLine());
						break;
					case 3:
						System.out.println("Enter price to update");
						bookToUpdate.setBookPrice(myInput.nextDouble());
						break;

					default:
						System.out.println("-----INVALID SELECTION-----");
						break;
					}
					if(controller.update(updateExist, bookToUpdate)) {
						System.out.println("update");
					}
				} else {
					System.out.println("Book does not exist, updation can not be perform");
				}
//			    	  updateBook.setBookName(myInput.nextLine());
//			    	  System.out.println("Enter updated Author Name:");
//			    	  updateBook.setBookAuthor(myInput.nextLine());
//			    	  System.out.println("Put the value you want to update:");
//			    	  updateBook.setBookPrice(myInput.nextDouble());
//			    	  myInput.nextLine();
//			    	  System.out.println("Book updated sucessfully");

				break;

			case 4:
				System.out.println("Enter book name you are looking for");
				book fetchBook = controller.getBook(myInput.nextLine());
				if (fetchBook != null) {
					System.out.println("Book is avilable.");
					System.out.println("Details :");
					System.out.println(fetchBook);
				} else {
					System.out.println("Not Avilable");
				}
				break;

			default:
				System.out.println("Invalid selection");
				break;
			}
		} while (true);
	}

}
