package com.test02;


import java.util.List;

public class Librarian extends Member {

	public Librarian(int memberID, String name) {
		super(memberID, name, Integer.MAX_VALUE);
		
	}
	public void addBook(Library library,Book book) {
		library.getBooks().add(book);
	}
	public void removeBook(Library library,Book book) {
		library.getBooks().remove(book);
	}
}